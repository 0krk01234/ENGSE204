import java.util.Scanner;
public class lab2point7 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("name: ");
        String name = input.nextLine();

        System.out.println("Balance: ");
        double balance = input.nextDouble();

        System.out.println("Frist withdow: ");
        double first = input.nextDouble();

        System.out.println("Second witdow");
        double second = input.nextDouble();

        BankAccount B1 = new BankAccount(name , balance);
        
        B1.withdraw(first);

        B1.withdraw(second);

        B1.displayBalance();

        input.close();
    }
    
}

 class BankAccount {
    String ownerName ;
    double Balance ;


    public BankAccount (String name , double Balance){

        this.ownerName = name ;
        this.Balance = Balance ;

    }

    public void withdraw(double amount) {

        if(amount <= this.Balance) {
            this.Balance -= amount ;
            System.out.println("Withdrawal successful.");
        }

        else{
            System.out.println("Insufficent funds.");
        }

    }

    public void displayBalance(){


        System.out.printf("Balance: %.2f", this.Balance);


    }
 }
