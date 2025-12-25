import java.util.Scanner;
public class lab5point3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;

        double salary = input.nextDouble();

        Manager Ma = new Manager(salary);

        System.out.println(Ma.calculateBonus());
    }
}
class Employee {
    protected double salary ;

    public Employee(double salary) {
        this.salary = salary ;
    }

    public double calculateBonus() {

        return salary * 0.1 ;

    }
}

class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus(){

       return super.calculateBonus() + salary * 0.5 ;

    }
}