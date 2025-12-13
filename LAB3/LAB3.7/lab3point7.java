import java.util.Scanner;
public class lab3point7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String codeName = input.nextLine();
        String positionStart = input.nextLine();
        String newPosition = input.nextLine();

        Employee Em1 = new Employee(codeName , positionStart);

        Em1.setDepartment(newPosition);
        System.out.println(Em1.getEmployeeld());
        System.out.println(Em1.getDepartment());
        input.close();
    }
}

class Employee {
    private String employeeid;
    private String department ;
    
    public Employee(String employeeld , String department) {
        this.employeeid = employeeld ;
        this.department = department ;
    }

    public String getEmployeeld() {
        return employeeid ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment ;
    }
}
