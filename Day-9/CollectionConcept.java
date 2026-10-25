import java.util.*;


class Student{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println(id+" "+name);
    }

}

public class CollectionConcept{

    public static void main(String[] args) {
       
        
        //     List<Integer> arr = new ArrayList<>();


        //     arr.add(1);
        //     arr.add(100);
        //     System.out.println(arr);
        
        //    CollectionConcept<Integer> ar=new CollectionConcept<>();
        //    ar.setarr1(1);
        List<Student> l =new ArrayList<>();
        while(true){
            
            System.out.println("1) enter id and name");
            System.out.println("2) display");
            System.out.println("3) exit");
            Scanner sc= new Scanner(System.in);
            int v=sc.nextInt();
            if (v==1){
            
                int x=sc.nextInt();
                
                String n=sc.next();
                Student a=new Student(x,n);
                l.add(a);
            }
            else if(v==2){
                for (Student s:l){
                    s.display();
                }
            }
            else{
                break;
            }



        }
        

    }
    
}
