
import java.util.Scanner;

public class lab2point2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = input.nextLine();
        String name = input.nextLine();

        Student S1 = new Student(id, name);
        S1.displayInfo();
        input.nextLine();
        input.close();
    }
}


class Student {
    String studentID;
    String name;

    public Student(String id, String name) {
        this.studentID = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(this.studentID);
        System.out.println(this.name);
    }
    
}
