import java.util.*;
class Student{
    int id;
    String name;
    public Student(int id ,String name){
        this.id=id;
        this.name=name;

    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

}

public class OO {
    public static void main(String[] args) {
        System.out.println("enter number of students");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Student[] arr=new Student[x];
        for (int i=0;i<x;i++){
            
            System.out.println("enter student id");
            int id=sc.nextInt();
            
            System.out.println("enter student name");
            String name=sc.next();
            Student s=new Student(id,name);
            arr[i]=s;
            
        }
        for(Student s: arr){
           s.display();
        }

    }
}
    

