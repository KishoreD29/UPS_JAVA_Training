import java.util.Scanner;

class Buffer {
    int n;
    boolean av = false, fn = false;

    synchronized void put(int x) throws InterruptedException {
        while (av)
            wait();

        n = x;
        av = true;
        System.out.println("Produced: " + x);
        notifyAll();
    }

    synchronized int get() throws InterruptedException {
        while (!av && !fn)
            wait();

        if (!av && fn)
            return -1;

        int x = n;
        av = false;
        System.out.println("Consumed: " + x);
        notifyAll();
        return x;
    }

    synchronized void end() {
        fn = true;
        notifyAll();
    }
}

class Producer extends Thread {
    Buffer b;
    int l;

    Producer(Buffer b, int l) {
        this.b = b;
        this.l = l;
    }

    public void run() {
        try {
            for (int i = 1; i <= l; i++)
                b.put(i);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            b.end();
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            while (b.get() != -1) {
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int l = sc.nextInt();

        if (l < 1) {
            System.out.println("Invalid limit");
            sc.close();
            return;
        }

        Buffer b = new Buffer();
        Producer p = new Producer(b, l);
        Consumer c = new Consumer(b);

        p.start();
        c.start();

        p.join();
        c.join();

        System.out.println("Completed");
        sc.close();
    }
}