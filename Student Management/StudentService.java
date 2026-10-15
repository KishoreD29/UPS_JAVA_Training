
import java.util.*;

public class StudentService {
    private final FileUtility fileUtility;

    public StudentService() {
        fileUtility = new FileUtility();
    }

    // Add new student
    public void addStudent(String id, String name) {
        List<String> students = fileUtility.readLines();

        for (String student : students) {
            String[] data = student.split("\\|", 2);

            if (data[0].equals(id)) {
                System.out.println("Student ID already exists");
                return;
            }
        }

        students.add(id + "|" + name);
        fileUtility.writeLines(students);
        System.out.println("Student added successfully");
    }

    // Displaying  Students details
    public void viewStudents() {
        List<String> students = fileUtility.readLines();

        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }

        for (String student : students) {
            String[] data = student.split("\\|", 2);
            System.out.println("ID: " + data[0] +
                               ", Name: " + data[1]);
        }
    }

    // Update student based on id 
    public void updateStudent(String id, String newName) {
        List<String> students = fileUtility.readLines();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            String[] data = students.get(i).split("\\|", 2);

            if (data[0].equals(id)) {
                students.set(i, id + "|" + newName);
                found = true;
                break;
            }
        }

        if (found) {
            fileUtility.writeLines(students);
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    // Deleting student details based on id 
    
    public void deleteStudent(String id) {
        List<String> students = fileUtility.readLines();
        boolean removed = students.removeIf(student ->
            student.split("\\|", 2)[0].equals(id)
        );

        if (removed) {
            fileUtility.writeLines(students);
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student not found");
        }
    }
}
