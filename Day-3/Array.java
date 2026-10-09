import java.rmi.server.SocketSecurityException;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;
public class Array {
    public static int even(int[] arr){
        int s=0;
        for (int x:arr){
            if (x%2==0){
                s+=x;
            }
        }
        return s;

    }
    //Addition of two matrix
    public static int[][] add(int[][] arr1,int[][] arr2){
        int x=arr1.length;
        int y=arr1[0].length;
        
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                arr1[i][j]+=arr2[i][j];
                
            }
        }
        return arr1;

    }

    //Creating of the matrix
    public static int[][] mat(){
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int[][] arr= new int[size1][size2];
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                System.out.println("Enter at index"+i+","+j);
                arr[i][j]=sc.nextInt();

            }
        }
        return arr;
    }

    // Displaying the matrix
    public static void display(int[][] arr){
        int size1=arr.length;
        int size2=arr[0].length;
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                System.out.print(arr[i][j] +" ");

            }
            System.out.println( "");
        }

    }
    public static int  search(int[] arr,int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static int[] twosum(int[]arr,int k){
        
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]+arr[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};


    }
    public static char[] merge(char[] arr,char[]arr1){
        char[] arr2=new char[arr.length+arr1.length];
        int c=0;
        for (char x:arr){
            arr2[c++]=x;
        }
        for (char x:arr1){
            arr2[c++]=x;
        }
        return arr2;
    }
    public static void main(String[] args) {
        
        // ------ ADDITION OF TWO MATRIX  ------------


        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int[] arr= new int[size];
        // for (int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(even(arr));
        // int[][] mat1=mat();
        // int [][]mat2=mat();
        // int[][] mat3=add(mat1,mat2);
        // display(mat3);



        // ------ FIND TARGET ELEMENT INDEX ------------

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter array size");
        // int s=sc.nextInt();
        // int[] arr=new int[s];
        // int k;
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("Enter array element");
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter search element");
        // k=sc.nextInt();
        // // System.out.println(search(arr, k));
        // int[] res=twosum(arr,k);
        // System.out.println(res[0]+" "+res[1]);




        
        // ------ ADD CHARACHTER ARRAY ------------

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter array size");
        // int s=sc.nextInt();
        // char[] arr=new char[s];
        // for(int i=0;i<s;i++){
        //     System.out.println("Enter character");
        //     arr[i]=sc.next().charAt(0);
        // }
        // System.out.println("Enter array size");
        // int f=sc.nextInt();
        // char[] arr1=new char[f];
        // for(int i=0;i<arr1.length;i++){
        //     System.out.println("Enter character");
        //     arr1[i]=sc.next().charAt(0); 
        // }
        // char[] res1=merge(arr,arr1);
        // for (char x:res1){
        //     System.out.print(x);
        // }




        // ------ FIND FIRST MIN AND SECOND MIN AND FIRST MAX AND SECOND MAX ------------

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int s=sc.nextInt();
        int[] arr=new int[s];
        
        for(int i=0;i<s;i++){
            System.out.println("Enter character");
            arr[i]=sc.nextInt();
            
        }
        int f1=0;
        int f2=0;
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>f1){
                if (f2<f1){
                    f2=f1;
                }
                f1=arr[i];  
            }
            else{
                if (f2<=arr[i]){
                    f2=arr[i];
                }
            }
            if (arr[i]<m1){
                if (m2>m1){
                    m2=m1;
                }
                m1=arr[i];  
            }
            else{
                if (m2>=arr[i]){
                    m2=arr[i];
                }
            }
        }
        System.out.println(f1+" "+f2);
        
        
    
        System.out.println(m1+" "+m2);

        
    }
    
}
