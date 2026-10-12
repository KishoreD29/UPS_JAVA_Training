import java.util.*;

class Student{
    int id;
    String name;
    public void setid(int id){
        this.id=id;

    }
    public void setname(String name){
        this.name=name;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

}

public class Encapsulation{
    public static void main(String[] args) {
        // System.out.println("enter number of students");
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // Student[] arr=new Student[x];
        // for (int i=0;i<x;i++){
            
       
        Student s=new Student();
        s.setid(1);
        s.setname("KIshore");
        System.out.println(s.getid());
        System.out.println(s.getname());
        
            
        
        
    }
}
    


