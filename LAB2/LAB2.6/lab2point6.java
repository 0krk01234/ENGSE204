import java.util.Scanner;

public class lab2point6 {

    public static void main(String[] bankkkkbalance) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("Balance1");
        double balance1 = input.nextDouble();

        System.out.println("Balance2");
        double balance2 = input.nextDouble();

        BankAccount B1 = new BankAccount(name , balance1);

        B1.deposit(balance2);
        B1.displaySummary();
    }
}

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String name , double balance2){
        this.ownerName = name;
        this.balance = balance2;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void displaySummary(){
        System.out.println(this.ownerName);
        System.out.printf("Balance = %.2f\n", this.balance);
    }
}
