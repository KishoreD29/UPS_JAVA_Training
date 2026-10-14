

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int x=sc.nextInt();
        if(x<0){
            System.out.println("Negative number");
        }
        else{
            int c=1;
            for (int i=1;i<=x;i++){
                c*=i;
            }
            System.out.println("Factorail of number :"+" "+c);
        }
    }
    
}
