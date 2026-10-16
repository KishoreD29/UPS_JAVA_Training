import java.util.Scanner;

class Invalidwithdraw extends java.lang.Exception{
    Invalidwithdraw(String a){
        super(a);
    }
    
}

class  BankAccount{
    int id;
    private int balance;
    public BankAccount(int id,int balance){
        this.id=id;
        this.balance=balance;
    }
    public String withdraw(int amount){
        try{
            if(amount>balance){
                throw new Invalidwithdraw("insufficient balance");

            }
            else{
                balance-=amount;
                return "withdraw successfull";
            }

        }
        catch(Exception e){
            return e.toString();

        }
        

    }
    public String deposit(int a){
        balance+=a;
        return "amount deposited";

    }
    public int getbalance(){
        return balance;
    }

}


public class Q8 {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(1,5000);
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("!) withdraw");
            System.out.println("2) deposit");
            System.out.println("3) balance");
            System.out.println("4) Exit");
            int x=sc.nextInt();
            if (x==1){
                System.out.println("enter amount");
                int a=sc.nextInt();
                System.out.println(b.withdraw(a));
            }
            else if(x==2){
                System.out.println("enter amount");
                int a=sc.nextInt();
                System.out.println(b.deposit(a));
                
                
            }
            else if(x==3){
                System.out.println("balance "+b.getbalance());
            }
            else{
                break;
            }
        }
        


        
    }

    
}
