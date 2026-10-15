
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder rev=new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));

        }
        System.out.println(rev);
    }
    
}
