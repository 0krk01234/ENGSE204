import java.util.Scanner;
public class lab2point6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("Balance1");
        double balance1 = input.nextLine();

        System.out.println("Balance2");
        double balance2 = input.nextLine();

        BankAccount B1 = BankAccount(name , balance2);
    }
    
}

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String name , double balance2){
        this.ownerName = name ;
        this.balance = balance2 ;
    }

    public void deposit(double balance2){
        double amount = balance2 + this.balance ;
    }

    public void displaySummary(){

        double amount = deposit();
        System.out.println(this.ownerName);
        System.out.printf("Balance = %.2f" , amount);
    }
}
