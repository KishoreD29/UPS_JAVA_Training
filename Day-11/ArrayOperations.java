import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int mx = 0, se = 0;
        boolean hm = false, hs = false;

        for (int x : a) {
            if (!hm || x > mx) {
                if (hm) {
                    se = mx;
                    hs = true;
                }
                mx = x;
                hm = true;
            } else if (x < mx && (!hs || x > se)) {
                se = x;
                hs = true;
            }
        }

        if (hs)
            System.out.println("Second largest: " + se);
        else
            System.out.println("No second-largest distinct element");

        sc.close();
    }
}