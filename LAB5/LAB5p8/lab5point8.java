import java.util.Scanner;
public class lab5point8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine();
        int studentId = input.nextInt();

        Student S1 = new Student(name, studentId);

        input.nextLine(); // clear
        name = input.nextLine();
        double saraly = input.nextDouble();

        Employee E1 = new Employee(name, saraly);

        Person[] Person = {S1 , E1} ;

        for (int i = 0 ; i < Person.length ; i ++) {
            Person P2 = Person[i] ;

            if (P2 instanceof Employee) { // instance check
                Employee Em1 = (Employee) P2; // Downcast
                Em1.applyBonus(10000);
            }
            else {

            }
        }

        System.out.println(S1.getStat());
        System.out.println(E1.getStat());
        

        
    }
    
}

class Person {
    protected String name ;

    public Person (String name ) {
        this.name = name ;
    }

    public String getStat() {
        return "Student: " + this.name ;
    }
}

class Student extends Person {
    protected int studentId ;
    
    public Student (String name , int studentId){

        super(name);
        this.studentId = studentId ;

    }

    @Override

    public String getStat(){

        return "Student: " + this.name + "," + "ID: " + this.studentId;
    }
}

class Employee extends Person {

    protected double salary ;

    public Employee(String name , double saraly) {
        super(name);
        this.salary = saraly ;
    }

    public void applyBonus(double bonus) {
        this.salary = this.salary + bonus ;
    }

    @Override

    public String getStat() {
        return "Employee: " + this.name + "," + " " + "Saraly: " + this.salary ;
    }
}
