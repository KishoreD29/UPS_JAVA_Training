import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            int f=0;
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    f=1;
                }
            }
            if (f==0){
                System.out.println(s1.charAt(i));
                break;
            }
            
        }
        
    }
}