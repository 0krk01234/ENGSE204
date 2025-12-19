import java.util.Scanner;
public class lab4point9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String id = input.nextLine();

        double startmoney = input.nextDouble();

        double deposit = input.nextDouble();

        double withdraw = input.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id , startmoney);

        ImmutableAccount acc2 = new ImmutableAccount(acc1.deposit(deposit));

        ImmutableAccount acc3 = new ImmutableAccount(acc2.withdraw(withdraw));

        acc1.displayInfo();
        acc3.displayInfo();

    }
}

class ImmutableAccount {

    private String accountId ;
    private double Balance ;

    public ImmutableAccount(String accountId , double balance) {

        this.accountId = accountId ;

        if (balance < 0.0) {
            this.Balance = 0.0 ;
        }
        
        else {
            this.Balance = balance ;
        }

    }

    public ImmutableAccount(ImmutableAccount other) {
        this.Balance = other.Balance ;
        this.accountId = other.accountId ;
    }

    public String getAccount(){
        return this.accountId ;
    }

    public Double getBalance(){
        return this.Balance ;
    }

    public void displayInfo(){
        System.out.println("ID: " + "" + this.accountId + "" + "," + "" + "Balance: " + "" + this.Balance);
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {

           double newAmount = this.Balance + amount ;

           return new ImmutableAccount(this.accountId , newAmount) ;
            
        }
        else {
            System.out.println("Invalid deposit amount.");
            return new ImmutableAccount(accountId ,this.Balance);
            
        } 
    }

    public ImmutableAccount withdraw(double amount){
        if(amount > 0 && amount <= this.Balance) {

            double newAmount = this.Balance - amount ;
            return new ImmutableAccount(this.accountId , newAmount);

        }

        else if (amount > this.Balance) {
            System.out.println("Insufficient funds.");
            return new ImmutableAccount(accountId ,this.Balance) ;
        }

        else {
            System.out.println("Invalid withdrawl amount."); 
            return new ImmutableAccount(accountId ,this.Balance) ;
        }
    }
}
