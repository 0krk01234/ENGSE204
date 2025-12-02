import java.util.Scanner;
public class lab2point4 {

    public static void main (String[] kananmidandfinal) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("midterm");
        int midterm = input.nextInt();

        System.out.println("Final");
        int finaal = input.nextInt();

        Student S1 = new Student(name , midterm , finaal);

        S1.displaySummary();

    }

}
class Student {

        String name ; 
        int midterm ;
        int finaal ;

        public Student (String name , int midterm , int finaal) {

            this.name = name ;
            this.midterm = midterm ;
            this.finaal = finaal ;

        }

        public double calculateAverage() {

            double average = (this.midterm + this.finaal) / 2.0 ;
            return average ;

            
        }

        public void displaySummary(){

            double average = calculateAverage();

            System.out.println("name");
            System.out.println(name);
            System.out.println(average);

            if(average < 50) {
                System.out.println("Fail");
            }

            else{
                System.out.println("Pass");
            }
        }
}