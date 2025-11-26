
import java.util.Scanner;

public class lab2point1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = input.nextLine();
        String name = input.nextLine();

        Student S1 = new Student(id, name); // สร้าง object ปกติ
        S1.getid();
        S1.getname();
        input.nextLine();
        input.close();
    }
}

// คลาส Student แยกออกมาแล้ว
class Student {
    String studentID;
    String name;

    public Student(String id, String name) {
        this.studentID = id;
        this.name = name;
    }

    public void getid(){
        System.out.println(studentID);
    }

    public void getname(){
        System.out.println(name);
    }
}
