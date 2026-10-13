class vechile{
    void start(){
        System.out.println("vechile started");
    }
}
class car extends vechile{
    void start(){
        System.out.println("car started");
    }
}
public class Overriding{
    public static void main(String[] args) {
        vechile a = new vechile();
        car c=new car();
        a.start();
        c.start();
    }
}