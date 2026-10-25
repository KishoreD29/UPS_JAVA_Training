import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            int n = i, sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit * digit;
                n /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}