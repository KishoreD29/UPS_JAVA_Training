
class cal{
    int add(int a,int b){
        return a+b;

    }
    double add(double a,double b){
        return a+b;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        cal c= new cal();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1.2,5));
        main(new char[] {'a'});
        
    }
    public static void main(char[] args) {
        System.out.println("HI");
        
    }
    
}

