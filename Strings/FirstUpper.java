
import java.util.Scanner;
public class FirstUpper {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        String result = "";
        boolean newWord = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (newWord && ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;

            if (ch == ' ' || ch == '\t') {
                newWord = true;
            } else {
                newWord = false;
            }
        }

        System.out.println(result);
    }

    
}
