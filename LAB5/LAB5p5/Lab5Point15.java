import java.util.Scanner;
public class Lab5Point15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double radius = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        Circle C1 = new Circle("Circle" , radius);
        Rectangle R1 = new Rectangle("Rectangle" ,width, height);

        Shape[] Shape = {C1 , R1};

        for(int i = 0 ; i < Shape.length ; i ++) {

            System.out.println(Shape[i].calculateArea());

        }
        
    }
    
}

class Shape {
    protected String name ;

    public Shape(String name) {

        this.name = name ;

    }

    public double calculateArea() {
        return 0.0 ;
    }
}

class Circle extends Shape {

    protected double radius ;

    public Circle(String name , double radius){

        super(name);
        this.radius = radius ;

    }

    @Override
    public double calculateArea() {
        return 3.14519 * this.radius * this.radius ;
    }
}

class Rectangle extends Shape {

    protected double width ;
    protected double height ;

    public Rectangle(String name , double width , double height) {

        super(name);
        this.width = width ;
        this.height = height ;

    }

    @Override 
    public double calculateArea() {
        return width * height ;
    }
}
