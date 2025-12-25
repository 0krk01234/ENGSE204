import java.util.Scanner;
public class lab5point12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //BasicService

        String name = input.nextLine();
        double basePrice = input.nextDouble();
        input.nextLine(); // clear

        BasicService B1 = new BasicService(name, basePrice);

        //premiumService
        name = input.nextLine();
        basePrice = input.nextDouble();
        input.nextLine(); // clear
        double premiumRate = input.nextDouble();

        PremiumService P1 = new PremiumService(name, basePrice, premiumRate);

        Service[] Ser = {B1 , P1};

        for(int i = 0 ; i < Ser.length ; i ++) {

            System.out.println(Ser[i].calculateFinalPrice());
        }

        input.close();
    }
    
}

class Service {

    protected String name ;
    protected double basePrice;

    public Service(String name , double basePrice){
        this.name = name ;
        this.basePrice = basePrice ;
    }

    public double calculateFinalPrice() {
        return this.basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name , double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return this.basePrice * 1.05 ;
    }
}

class PremiumService extends Service {
    protected double premiumRate ;

    public PremiumService (String name , double basePrice , double premiumRate) {

        super(name, basePrice);
        this.premiumRate = premiumRate ;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + this.premiumRate);
    }
}
