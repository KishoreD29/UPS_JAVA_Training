import java.util.*;
public class LoopStatements {
    public static void main(String[] args) {
        // int i=10;
        // while(i>=0){
        //     System.out.println(i);
        //     i-=1;

        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter start value");
        // int i=sc.nextInt();
        // System.err.println("enter end value");
        // int j=sc.nextInt();
        // if (i%2!=0){
        //         i+=1;
        //     }
        // while(i<=j){
            
        //     i+=2;
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter end value");
        // int x=sc.nextInt();
        // int s=0;
        // for (int i =1;i<x;i++){
        //     s=s*2+1;
            

        // }
        // System.out.println(s);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter value");
        // int x=sc.nextInt();
        // int f=1;
        // do{
        //     f*=x;
        //     x-=1;
        // }while(x>=1);
        // System.out.println( f);

        Scanner sc=new Scanner(System.in);
    //     System.out.println("enter value");
    //     int x=sc.nextInt();
    //     int digits=0;
    //     while(x>=1){
    //         int r=x%10;
    //         x=x/10;
    //         digits+=1;
    //     }
    //     System.out.println(digits);
        
    // }
    
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(x+"*"+i+" "+"="+ x*i);
        }
    }
}
