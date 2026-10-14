import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


class StudentManagement{
    public void create(){
        try{
        File file=new File("one.txt");
        file.createNewFile();
        System.out.println("created sucessfully");
        }
        catch(IOException e){
            System.out.println(e);

        }
        


    }
    public String read(){
        try{
            FileReader fileReader=new  FileReader("one.txt");
            List<String> arr=new ArrayList<>();
            arr=fileReader.readAllLines();
            StringBuilder s=new StringBuilder();
            for(String x:arr){
                s.append(x);
                s.append(" ");
                
            }
            
           return s.toString();
        }
        catch(IOException e){
            return "error";
        }

    }
    public void write(String id,String name){
        try{
            FileWriter fileWriter=new  FileWriter("one.txt",true);
            String s=id+" "+name;
            System.out.println(s);
            fileWriter.write(s);
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println(e);

        }

    }
    public String delete(){
        try{
            FileReader fileReader=new  FileReader("one.txt");
            List<String> arr=new ArrayList<>();
            arr=fileReader.readAllLines();
            return "Deleted successfully";
        }
        catch(IOException e){
           return e.toString();
        }

    }
}
public class FileHandling{
    
    public static void main(String[] args) {
        StudentManagement s=new StudentManagement();
        // s.create();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1) Create");
            System.out.println("2) Read");
            System.out.println("3) Write");
            System.out.println("4) Update");

            int x=sc.nextInt();


            if (x==1){

            }
            else if(x==2){
                System.out.println(s.read());
            }
            
        }
        
        

        

        
        
    }
}