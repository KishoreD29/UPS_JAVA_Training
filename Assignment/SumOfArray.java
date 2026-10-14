import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int x=sc.nextInt();
        int[] arr=new int[x];
        int s=0;
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        System.out.println("Sum of elements in the array"+" "+s);

    }
    
}
