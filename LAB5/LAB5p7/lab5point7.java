import java.util.Scanner;
public class lab5point7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        //SalesEmployee 

        String name = input.nextLine();
        double salary = input.nextDouble();
        double rate = input.nextDouble();

        SalesEmployee S = new SalesEmployee(name, salary, rate);

        //Manager
        input.nextLine();
        name = input.nextLine();
        salary = input.nextDouble();
        double bonus = input.nextDouble();

        Manager M = new Manager(name, salary, bonus);


        PayrollProcessor.PayrollProcessor(S);
        PayrollProcessor.PayrollProcessor(M);

        
    }
    
}

class Employee {
    
    protected String name ;
    protected double baseSalary;

    public Employee (String name , double baseSalary) {
        
        this.name = name ;
        this.baseSalary = baseSalary ;

    }

    public double calculatePay() {
        return baseSalary ;
    }
}

class SalesEmployee extends Employee {

    protected double commission ;

    public SalesEmployee(String name , double baseSalary , double commission) {
        
        super(name , baseSalary);
        this.commission = commission ;

    }

    @Override
    public double calculatePay() {

        return baseSalary * commission ;

    }
}

class Manager extends Employee {

    protected double fixedBonus ;

    public Manager (String name , double baseSalary , double fixedBonus) {

        super(name, baseSalary);
        this.fixedBonus = fixedBonus ;

    }

    @Override

    public double calculatePay() {

        return baseSalary + fixedBonus ;

    }
}

class PayrollProcessor {

    public static void PayrollProcessor(Employee e) {

        System.out.println(e.name + " " + "total Pay: " + e.calculatePay());

    }
}
