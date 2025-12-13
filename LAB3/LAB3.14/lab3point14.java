import java.util.Scanner;
public class lab3point14 {

    public static void main(String[] accountddd) {
        
        Scanner input = new Scanner(System.in) ;

        BankAccount myAccount = null ;
        int N = input.nextInt();

        input.nextLine();

        for(int i = 0 ; i < N ; i++){
            System.out.println("Enter order: ");
            String order = input.nextLine();

            if(order.equals("CREATE")){

                double startMoney = input.nextDouble();
                myAccount = new BankAccount(startMoney);

            }

            else if (order.equals("DEPOSIT")) {
                double deposit = input.nextDouble();
                if(myAccount == null) {
                    System.out.println("No account exists.");
                }
                else {
                    myAccount.deposit(deposit) ;
                }
            }

            else if (order.equals("WITHDRAW")) {

                double withdraw = input.nextDouble();

                if(myAccount == null) {
                    System.out.println("No account exists.");
                }
                else {
                    myAccount.withdraw(withdraw) ;
                }

            }

            else if (order.equals("STATUS")) {

                if(myAccount == null) {
                    System.out.println("NO account exists.");
                }

                else {
                    System.out.println("Balance: =" + myAccount.getBalance());
                }
            }

            else if (order.equals("GLOBAL_STATUS")) {
                System.out.println("Total Transaction = "+ BankAccount.getTotalTransactionCount());
            }

            else {
                System.out.println("ERROR INPUT!");
            }
        }
        input.close();
    }
    
}

class BankAccount {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if(initialDeposit >= 0) {
            this.balance = initialDeposit ;
        }
        else {
            this.balance = 0 ;
        }
    }

    public void deposit(double amount) {
        if(amount > 0 ) {
            this.balance += amount;
            totalTransactionCount ++ ;
            System.out.println("Deposit successful.");
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            this.balance -= amount ;
            totalTransactionCount ++ ;
            System.out.println("Withdrawal successful.");
        }
        else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return this.balance ;
    }

    public static int getTotalTransactionCount(){
        return totalTransactionCount ;
    }
}