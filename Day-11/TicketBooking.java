import java.util.Scanner;

class TicketCounter {
    int t = 10;

    synchronized void book(String nm) {
        if (t >= 4) {
            t -= 4;
            System.out.println(nm + " booked 4 tickets");
        } else {
            System.out.println(nm + " booking failed");
        }
    }
}

class Customer extends Thread {
    TicketCounter tc;

    Customer(TicketCounter tc, String nm) {
        super(nm);
        this.tc = tc;
    }

    public void run() {
        tc.book(getName());
    }
}

public class TicketBooking {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 customer names: ");
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        TicketCounter tc = new TicketCounter();

        Customer c1 = new Customer(tc, n1);
        Customer c2 = new Customer(tc, n2);
        Customer c3 = new Customer(tc, n3);

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("Remaining: " + tc.t);
        sc.close();
    }
}