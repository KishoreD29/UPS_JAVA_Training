
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         try{
//             int a=10/0;
//             System.out.println(a);
            
//         }
//         catch(ArithmeticException e){
//             System.out.println("zero division is not possible"+" "+e);

//         }
//     }
    
// }

class InvalidAge extends java.lang.Exception{
    InvalidAge(String a){
        super(a);
    }
    
}
class A{
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