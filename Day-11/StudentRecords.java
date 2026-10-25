import java.io.*;
import java.util.*;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = "students.txt";

        try {
            System.out.print("Enter student count (minimum 5): ");
            int n = Integer.parseInt(sc.nextLine());

            if (n < 5) {
                System.out.println("Enter at least 5");
                return;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                for (int i = 0; i < n; i++) {
                    System.out.print("ID, name, marks: ");
                    String id = sc.nextLine();
                    String nm = sc.nextLine();
                    double mk = Double.parseDouble(sc.nextLine());

                    bw.write(id + "," + nm + "," + mk);
                    bw.newLine();
                }
            }

            String ln, hi = "";
            double mx = -1;

            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                while ((ln = br.readLine()) != null) {
                    System.out.println(ln);
                    String[] a = ln.split(",", 3);
                    double mk = Double.parseDouble(a[2]);

                    if (mk > mx) {
                        mx = mk;
                        hi = ln;
                    }
                }
            }

            System.out.println("Highest: " + hi);

            System.out.print("New student ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String nm = sc.nextLine();
            System.out.print("Marks: ");
            double mk = Double.parseDouble(sc.nextLine());

            try (BufferedWriter bw = new BufferedWriter(
                    new FileWriter(f, true))) {
                bw.write(id + "," + nm + "," + mk);
                bw.newLine();
            }

            System.out.println("Appended successfully");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}