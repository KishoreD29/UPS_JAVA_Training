import java.util.Scanner;

class student{
    int roll_no;
    String name;
    int[] marks=new int[5];
    public student(int roll_no,String name,int[] marks){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
        
    }
    public float average(){
        int s=0;
        for (int x: marks){
            s+=x;

        }
        return s/5;
        

    }
    public float sum(){
        int s=0;
        for (int x: marks){
            s+=x;

        }
        return s;

    }
    public String name(){
        return this.name;
    }
    public String grade(){
        float g=average();
        if(g>=90){
            return "A";
        }
        else if(g>=75){
            return "B";
        }
        else if(g>=60){
            return "C";
        }
        else if(g>=40){
            return "D";
        }
        else{
            return "F";
        }

    }


}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        student[] s= new student[x];

        for(int i=0;i<x;i++){
            
            System.out.println("enter roll_no");
            int r=sc.nextInt();
            System.out.println("enter name");
            sc.nextLine();
            String n=sc.nextLine();
            int[] m= new int[5];
            for (int j=0;j<5;j++){
                System.out.println("enter marks for subject "+j+1);
                m[j]=sc.nextInt();

            }
            s[i]= new student(r,n,m);


        }
        

        
    
        for (student a:s){
        System.out.println("NAME "+a.name());
        System.out.println("TOTAL "+a.sum());
        System.out.println("AVERAGE "+a.average());
        System.out.println("GRADE "+a.grade());
        }
    }
    

    
}
