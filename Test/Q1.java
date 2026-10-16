
import java.util.*;
import java.util.HashSet;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr= new int[x];
        for (int i=0;i<x;i++){
            System.out.println("Enter element at position "+i+1+": ");
            arr[i]=sc.nextInt();
            
        }
        HashSet<Integer> s= new HashSet<>();
        for (int i=0;i<x;i++){
            for (int j=i+1;j<x;j++){
                if (arr[i]==arr[j]){
                    s.add(arr[i]);
                }
            }
        }
        for (int v:s){
            System.out.println(v);
        }

        
    }
    
}
