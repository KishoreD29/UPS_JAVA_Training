import java.util.Scanner;

class ATM{
    private int id;
    private int balance;
    ATM(int id,int balance){
        this.id=id;
        this.balance=balance;

    }
    public int  getbalance(){
        return balance;

    }
    public String withdraw(int amount){
        if (amount>balance){
            return "Insufficient balance";
        }
        else{
            balance-=amount;
            return "WITHDRAWN SUCESSFULLY";
        }
    }

    

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM obj=new ATM(1,1000);
        while (true){
            
            System.out.println("1) WITHDRAW");
            System.out.println("2) BALANCE");
            System.out.println("3) EXIT");
            int x=sc.nextInt();
            if (x==3){
                break;
            }
            else if(x==1){
            System.out.println("ENTER AMOUNT");
            int amount=sc.nextInt();
            System.out.println(obj.withdraw(amount));
            }
            else{
                System.out.println("BALANCE"+" "+obj.getbalance());

            }
        }
        
        
        
        
    }
    
}
