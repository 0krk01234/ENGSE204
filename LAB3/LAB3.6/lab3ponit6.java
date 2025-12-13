import java.util.Scanner; 
public class lab3ponit6 {

    static public void main (String[] bankAccount) {

        Scanner input = new Scanner(System.in);

        double InitialAmounty = input.nextDouble();
        double deposit = input.nextDouble();
        double withdraw = input.nextDouble();

        bbankAccount B1 = new bbankAccount(InitialAmounty);

        B1.deposit(deposit);
        B1.withdraw(withdraw);
        System.out.println("Final Balance: "+ B1.getBalance());
        input.close();
    }
    
}

class bbankAccount {
    private double balance ;

    public bbankAccount(double initialBalance) {

        if (initialBalance < 0) {
    }
    else {

    this.balance = initialBalance;
 }
}


    public double getBalance() {
        return this.balance ;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount ;
            System.out.println("Deposit successful.");
        }
        else {
            System.out.println("Invalid deposit amount");
        }

    }

    public void withdraw(double amount) {
        
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount ;
            System.out.println("Withdrawal successfu");
        }

        else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        }

        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
