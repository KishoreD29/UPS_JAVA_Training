import java.util.*;

public class SortTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] br = new int[m];

        for (int i = 0; i < m; i++)
            br[i] = sc.nextInt();

        int[] cr = new int[n + m];

        for (int i = 0; i < n; i++)
            cr[i] = ar[i];

        for (int i = 0; i < m; i++)
            cr[n + i] = br[i];

        for (int i = 0; i < cr.length - 1; i++) {
            for (int j = 0; j < cr.length - 1 - i; j++) {
                if (cr[j] > cr[j + 1]) {
                    int temp = cr[j];
                    cr[j] = cr[j + 1];
                    cr[j + 1] = temp;
                }
            }
        }

        for (int x : cr)
            System.out.print(x + " ");

    }
}

