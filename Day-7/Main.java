
class A extends Thread{
    public void run(){
        try{
    
        
            sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);

        }

        System.out.println("A");

    }
}
class B extends Thread{
    public void run(){
        System.out.println("B");

    }
}
public class Main{
    public static void main(String[] args) {
        A t1= new A();
        B t2= new B();
        
        t1.start();
        t2.start();
        
    }
    
}
