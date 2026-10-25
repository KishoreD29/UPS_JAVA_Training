import java.io.*;
import java.util.*;

class Employee {
    int id;
    String nm, dp;
    double sl;

    Employee(int id, String nm, String dp, double sl) {
        this.id = id;
        this.nm = nm;
        this.dp = dp;
        this.sl = sl;
    }

    public String toString() {
        return id + "," + nm + "," + dp + "," + sl;
    }
}

public class EmployeeRecordManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> a = new ArrayList<>();
    static HashMap<Integer, Employee> m = new HashMap<>();
    static HashSet<Integer> s = new HashSet<>();
    static String f = "employees.txt";

    static void add() {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (s.contains(id)) {
                System.out.println("ID exists");
                return;
            }

            System.out.print("Name: ");
            String nm = sc.nextLine().trim();

            System.out.print("Department: ");
            String dp = sc.nextLine().trim();

            System.out.print("Salary: ");
            double sl = Double.parseDouble(sc.nextLine());

            if (nm.isEmpty() || dp.isEmpty()
                    || sl < 0 || !Double.isFinite(sl)) {
                System.out.println("Invalid details");
                return;
            }

            Employee e = new Employee(id, nm, dp, sl);
            a.add(e);
            m.put(id, e);
            s.add(id);

            System.out.println("Added");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    static void search() {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Employee e = m.get(id);

            System.out.println(e == null ? "Not found" : e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID");
        }
    }

    static void update() {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Employee e = m.get(id);

            if (e == null) {
                System.out.println("Not found");
                return;
            }

            System.out.print("New salary: ");
            double sl = Double.parseDouble(sc.nextLine());

            if (sl < 0 || !Double.isFinite(sl)) {
                System.out.println("Invalid salary");
                return;
            }

            e.sl = sl;
            System.out.println("Updated");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    static void delete() {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Employee e = m.remove(id);

            if (e == null) {
                System.out.println("Not found");
                return;
            }

            a.remove(e);
            s.remove(id);
            System.out.println("Deleted");
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID");
        }
    }

    static void display() {
        for (Employee e : a)
            System.out.println(e);
    }

    static void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            for (Employee e : a) {
                bw.write(e.toString());
                bw.newLine();
            }
            System.out.println("Saved");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    static void load() {
        File x = new File(f);
        if (!x.exists())
            return;

        try (BufferedReader br = new BufferedReader(new FileReader(x))) {
            String ln;

            while ((ln = br.readLine()) != null) {
                try {
                    String[] d = ln.split(",", -1);
                    if (d.length != 4)
                        continue;

                    int id = Integer.parseInt(d[0]);
                    String nm = d[1], dp = d[2];
                    double sl = Double.parseDouble(d[3]);

                    if (s.contains(id) || nm.isEmpty() || dp.isEmpty()
                            || sl < 0 || !Double.isFinite(sl))
                        continue;

                    Employee e = new Employee(id, nm, dp, sl);
                    a.add(e);
                    m.put(id, e);
                    s.add(id);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid record");
                }
            }
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    public static void main(String[] args) {
        load();

        while (true) {
            System.out.println(
                "\n1.Add 2.Search 3.Update 4.Delete 5.Display 6.Save and Exit"
            );

            try {
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {
                    case 1: add(); break;
                    case 2: search(); break;
                    case 3: update(); break;
                    case 4: delete(); break;
                    case 5: display(); break;
                    case 6:
                        save();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid choice");
            }
        }
    }
}