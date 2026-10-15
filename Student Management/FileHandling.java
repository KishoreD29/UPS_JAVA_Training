
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    service.addStudent(id, name);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    service.updateStudent(updateId, newName);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();

                    service.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
