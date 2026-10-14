import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1) Celsius to Fahrenheit");
        System.out.println("2) Fahrenheit to Celsius");
        System.out.println("Enter the option :");
        int x=sc.nextInt();
        System.out.println("Enter value:");
        int y=sc.nextInt();
        if (x==1){
            System.out.println((y*9/5)+32+" "+"F");
        }
        else{
            System.out.println((y-32)*(5/9)+" "+"C");
        }
    }
    
}
