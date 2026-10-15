public class T {
    public static void main(String[] args) {
        Object obj=new Object();
        Thread t1= new Thread(()->{
            synchronized(obj){
                System.out.println("thread1 is running");
                try{
                    obj.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                System.out.println("thread 1 is resumed");
        }});
        t1.start();
        Thread t2= new Thread(()->{
            synchronized(obj){
                System.out.println("thread2 is running");
                try{
                    obj.notify();
                    System.out.println("thread 1 is notified");
                }
                catch(Exception e){
                    System.out.println(e);
                }
        }}); 
        t2.start();
   }
    
}
