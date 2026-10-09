
import java.util.Scanner;
public class Calulator {
    
    public static int operation(int val1,int val2,int op){
        if(op==1){
            return val1+val2;
        }
        else if(op==2){
            return val1-val2;
        }
        else if(op==3){
            return val1*val2;
        }
        else if(op==4){
            return val1%val2;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        while(true){
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Modulo");
            System.out.println("5) EXIT");

            Scanner sc=new Scanner(System.in);
            int op=sc.nextInt();
            if (op==5){
                break;
            }
            int val1=sc.nextInt();
            int val2=sc.nextInt();
            System.out.println(operation(val1,val2,op));
        }
        

        
    }
    
}
