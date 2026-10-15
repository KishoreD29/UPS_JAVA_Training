import java.util.*;

public class Words {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ' && ch != '\t') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Word count: " + count);
    }
}
    
