import java.util.Scanner;
public class lab2point3 {

    public static void main(String[] Studenteiei) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i < n ; i++) {

            System.out.println("EnterID");
            String id = input.nextLine();
            System.out.println("Entername");
            String name = input.nextLine();

            Student S1 = new Student(name , id);
            
        }

        System.out.println(Student.studentCount);

    }
    

}

class Student {
    String name ;
    String studentID ;
    static int studentCount = 0 ;

    public Student(String name , String id ){

        this.name = name ;
        this.studentID = id ;
        studentCount ++ ;

    }
 }

