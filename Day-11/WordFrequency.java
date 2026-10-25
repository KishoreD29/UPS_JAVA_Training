import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Empty sentence");
            sc.close();
            return;
        }

        HashMap<String, Integer> m = new HashMap<>();
        String[] a = s.toLowerCase().split("\\s+");

        for (String w : a)
            m.put(w, m.getOrDefault(w, 0) + 1);

        for (String w : m.keySet())
            System.out.println(w + "=" + m.get(w));

        String fw = "";
        int mx = 0;

        for (String w : m.keySet())
            if (m.get(w) > mx) {
                mx = m.get(w);
                fw = w;
            }

        System.out.println("Most frequent: " + fw);
        System.out.println("Count: " + mx);

        sc.close();
    }
}