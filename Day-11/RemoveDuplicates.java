import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            s.add(sc.nextInt());

        System.out.println("Unique values: " + s);
        System.out.println("Count: " + s.size());

        System.out.print("Search value: ");
        int x = sc.nextInt();

        System.out.println(s.contains(x));

        sc.close();
    }
}