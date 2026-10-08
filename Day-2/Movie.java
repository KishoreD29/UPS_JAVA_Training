import java.util.Scanner;
class Movie{
    public static void main(String[] args){
        while(true){
        System.out.println("ENTER YOUR SPECIFICATION ");
        System.out.println("1) THRILLER");
        System.out.println("2) HORROR");
        System.out.println("3) Romance");
        System.out.println("4) EXIT");
        System.out.println("---------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int spec=sc.nextInt();
        if (spec>=1 && spec<=14){
            System.out.print("ENJOY YOUR SHOW ");
            if (spec==1){
                System.out.println("ON Thriller");
            }
            else if(spec==2){
                System.out.println("ON Horror");
            }
            else if(spec==3){
                System.out.println("ON Romance");
            }
            else{
                break;
            }
            
        }
        else{
            System.out.println("ENTER a valid choice ");
        }
        System.out.println("---------------------------------");
    }
    }
}