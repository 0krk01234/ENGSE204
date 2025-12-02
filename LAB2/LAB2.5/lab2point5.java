import java.util.Scanner;
public class lab2point5 {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();

        System.out.println("");

        double number2 = input.nextDouble();

        Rectangle R1 = new Rectangle(number1 , number2);

        System.out.println("Area is: " + R1.Getarea(number1 , number2));
        System.out.println("Perimeter is: " + R1.getPerimeter(number1 , number2));


    }
}

class Rectangle {
    double width ; 
    double height ;

    Rectangle(double num1 , double num2) {
        this.width = num1 ;
        this.height = num2 ;
    }

    public double Getarea(double width , double height){
 
        double area = this.width * this.height ;

        return area ;
    }

    public double getPerimeter(double width , double height){
        double Perimeter = 2 * (this.width + this.height) ;
        return Perimeter ;
    }
}
