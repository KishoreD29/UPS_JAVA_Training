import java.util.Scanner;

class Employee {
    int id;
    String nm;
    double bs;

    Employee(int id, String nm, double bs) {
        this.id = id;
        this.nm = nm;
        this.bs = bs;
    }

    double calculateSalary() {
        return bs;
    }

    void display() {
        System.out.println(id + " " + nm + " " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String nm, double bs) {
        super(id, nm, bs);
    }

    double calculateSalary() {
        return bs * 1.2;
    }
}

class PartTimeEmployee extends Employee {
    int hr;
    double rt;

    PartTimeEmployee(int id, String nm, int hr, double rt) {
        super(id, nm, 0);
        this.hr = hr;
        this.rt = rt;
    }

    double calculateSalary() {
        return hr * rt;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Full-time ID, name, salary: ");
        int i1 = sc.nextInt();
        String n1 = sc.next();
        double s1 = sc.nextDouble();

        System.out.print("Part-time ID, name, hours, rate: ");
        int i2 = sc.nextInt();
        String n2 = sc.next();
        int h = sc.nextInt();
        double r = sc.nextDouble();

        Employee[] a = {
            new FullTimeEmployee(i1, n1, s1),
            new PartTimeEmployee(i2, n2, h, r)
        };

        for (Employee e : a)
            e.display();

        sc.close();
    }
}