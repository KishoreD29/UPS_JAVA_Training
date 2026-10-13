// class engine{
//     void start(){
//         System.out.println("start");
//     }
//     void stop(){
//         System.out.println("stop");
//     }
// }

// class car extends engine{


// }

// public class Inheritance{
//     public static void main(String[] args) {
//         car c=new car();
//         c.start();
//         c.stop();
        
//     }
// }

class engine{
    void start(){
        System.out.println("start");
    }
    void stop(){
        System.out.println("stop");
    }
}

class car extends engine{
    void  run(){
        System.err.println("can run");
    }


}
class  ferrari extends car{

}

public class Inheritance{
    public static void main(String[] args) {
        ferrari b=new ferrari();
        b.start();
        b.run();
        b.stop();
    
        
    }
}

