import java.util.Scanner;
public class lab5point4 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in) ;

    String color = input.nextLine();
    int wheeks = input.nextInt();

    Car C1 = new Car(color, wheeks);
    C1.displayDetails();
    }
}


class Vehicle {
    protected String color ;

    public Vehicle(String color) {
        this.color = color ;
    }

}

class Car extends Vehicle {

    protected int wheels ;

    public Car(String color , int wheels) {

        super(color); 
        this.wheels = wheels ;

    }

    public void displayDetails() {
        
        System.out.println("Color: " +this.color + "," + " " + "Wheels: " +this.wheels);

    }
}
