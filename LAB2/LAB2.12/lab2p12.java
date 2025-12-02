import java.util.Scanner;
public class lab2p12 {
    public static void main (String[] labp12aboutcourse) {
        Scanner input = new Scanner (System.in);

        String subJect = input.nextLine();
        String nameSubJect = input.nextLine();
        String namee = input.nextLine();     

        Course C1 = new Course(subJect , nameSubJect);
        Student S1 = new Student(namee , C1);

        S1.displayEnrollment();
    }
}

class Course {
    String Courseld ;
    String CourseName ;

    public Course(String names , String names2){
        this.Courseld = names ;
        this.CourseName = names2 ;
    }

    public String getCourseInfo() {
        return this.Courseld + ":" + this.CourseName ;
    }
    
}

class Student {
    String studentName ;
    Course enrolledCourse ;

    public Student(String studentName , Course Course1) {
        this.studentName = studentName ;
        this.enrolledCourse = Course1 ;
    }

    public void displayEnrollment(){
        System.out.println("Student: " + this.studentName);
        System.out.println("Enrolled in: "+this.enrolledCourse.getCourseInfo());

    }
}