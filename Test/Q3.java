import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] f1 = new int[26];
        int[] f2= new int[26];
        for (int i=0;i<s1.length();i++){
            char x=s1.charAt(i);
            System.out.println(97-x);
            f1[x-97]+=1;

        }
        for (int i=0;i<s2.length();i++){
            char y=s2.charAt(i);
            System.out.println(y);
            f2[y-97]+=1;
            
        }
        int f=0;
        for (int i=0;i<26;i++ ){
        
            if (f1[i]!=f2[i]){
                System.out.println("NOT A ANAGRAM");
                f=1;

            }
        
        }
        if (f==0){
            System.out.println("Anagram");
        }
    }
}