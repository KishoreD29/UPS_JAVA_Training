class InvalidAge extends java.lang.Exception{
    InvalidAge(String a){
        super(a);
    }
    
}
public class Custom{
    public static void main(String[] args) {
        
    
    int age=1000;
    try{
        if (age>=100){
            throw new InvalidAge("Not a valid age");
        }
    }
    catch(Exception e){
        System.out.println(e);

    }
}
    
}