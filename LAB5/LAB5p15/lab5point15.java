import java.util.Scanner;
public class lab5point15 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String model = input.nextLine();
        double rentalRate = input.nextDouble();

        Car C1 = new Car(model, rentalRate);

        input.nextLine();
        model = input.nextLine();
        rentalRate = input.nextDouble();

        Motorcycle M1 = new Motorcycle(model, rentalRate);

        double totalRentalFee = 0;

        RentalVehicle[] RentalVehicle = {C1 , M1};

        for(int i = 0 ; i < RentalVehicle.length ; i ++) {

            totalRentalFee += RentalVehicle[i].calculateFee();
        }

        System.out.println("Total: " + totalRentalFee);
       
        
    }

}

class RentalVehicle {

    protected String model ;
    protected double rentalRate;


    public RentalVehicle(String model , double rentalRate) {

        this.model = model ;
        this.rentalRate = rentalRate ;

    }

    public double calculateFee() {
        return this.rentalRate ;
    }
}

class Car extends RentalVehicle {

    public Car(String model , double rentalRate) {

        super(model, rentalRate);
    }

    @Override 
    public double calculateFee() {
        return this.rentalRate + 100.0 ;
    }
}

class Motorcycle extends RentalVehicle {

    public Motorcycle (String model , double rentalRate) {
        
        super(model, rentalRate);

    }

    @Override

    public double calculateFee() {
        return rentalRate * 1.10 ;
    }
}
