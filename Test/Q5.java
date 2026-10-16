import java.util.*;
public class Q5 {
    public static void rev(int[] arr,int i,int j){
        
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=1;
            j-=1;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr= new int[x];
        for (int i=0;i<x;i++){
            System.out.println("Enter element at position "+i+1+": ");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("ENTER k position");
        int k=sc.nextInt();
        rev(arr,0,arr.length-k-1);
        
        rev(arr,arr.length-k,arr.length-1);
        
        rev(arr,0,arr.length-1);
        for (int s:arr){
            System.out.println(s);
        }
    }
}


1 2 3 4 5
k=2
3 2 1 5 4
4 5 1 2 3