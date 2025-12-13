import java.util.Scanner;
public class lab3point12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name = input.nextLine(); 
        double monthluSalary = input.nextDouble();
        double taxRate = input.nextDouble();
        double raiseAmount = input.nextDouble();

        Employee E1 = new Employee(name, monthluSalary);

        System.out.println("Tax(Before): = " + E1.calculateTax(taxRate));
        E1.giveRiase(raiseAmount);
        System.out.println("Tax (After): = " + E1.calculateTax(taxRate));
        input.close();
    }
}

class Employee {
    private String name;
    private double monthlySalary;

    public Employee (String name , double monthluSalary) {
        this.name = name ;
        if (monthluSalary > 0) {
            this.monthlySalary = monthluSalary ;
        }
    }

    public String getName() {
        return this.name ;
    }

    public void giveRiase(double amount) {
        if(amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        }
        else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return  this.monthlySalary * 12 ;
    }

    public double calculateTax(double taxRate) {
        getAnnualSalary();
        return getAnnualSalary() * taxRate ;
    }
}
