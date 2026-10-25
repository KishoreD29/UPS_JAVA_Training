import java.util.*;

class Student {
    int rn, mk;
    String nm;

    Student(int rn, String nm, int mk) {
        this.rn = rn;
        this.nm = nm;
        this.mk = mk;
    }

    public String toString() {
        return rn + " " + nm + " " + mk;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();

        System.out.print("Enter student count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Roll, name, mark: ");
            int r = sc.nextInt();
            String nm = sc.next();
            int m = sc.nextInt();
            a.add(new Student(r, nm, m));
        }

        for (Student s : a)
            if (s.mk > 75)
                System.out.println(s);

        System.out.print("Search roll: ");
        int r = sc.nextInt();
        Student f = null;

        for (Student s : a)
            if (s.rn == r) {
                f = s;
                break;
            }

        if (f != null) {
            System.out.println(f);
            System.out.print("New mark: ");
            f.mk = sc.nextInt();
        } else {
            System.out.println("Not found");
        }

        System.out.print("Remove roll: ");
        int rm = sc.nextInt();
        a.removeIf(s -> s.rn == rm);

        a.sort(Comparator.comparingInt(s -> s.mk));

        for (Student s : a)
            System.out.println(s);

        sc.close();
    }
}