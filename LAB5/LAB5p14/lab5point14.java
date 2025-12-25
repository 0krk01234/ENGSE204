import java.util.Scanner;
public class lab5point14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String id ;
        double baseFee ;
        double insuranceFee ;

        id = input.nextLine();
        baseFee =  input.nextDouble();
        StandardShipping S1 = new StandardShipping(id, baseFee);

        input.nextLine();
        id = input.nextLine();
        baseFee =  input.nextDouble();
        insuranceFee = input.nextDouble();
        PremiumShipping Pre1 = new PremiumShipping(id, baseFee, insuranceFee);

        Shipping[] shipping = {S1 , Pre1};

        for(int i = 0 ; i < shipping.length ; i ++) {

            System.out.println(shipping[i].calculateTotalFee());
        }
        
    }
}

class Shipping {

    protected String trackingld ;
    protected double baseFee ;

    public Shipping(String trackingld , double baseFee) {

        this.trackingld = trackingld ;
        this.baseFee = baseFee ;
    }

    public double calculateTotalFee() {

        return baseFee ;

    }
}

class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {
        super(id , baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05 ;
    }
}

class PremiumShipping extends Shipping {

    protected double insuranceFee ;

    public PremiumShipping(String id , double baseFee , double insuranceFee) {

        super(id , baseFee);

        this.insuranceFee = insuranceFee ;

    }

    @Override


    public double calculateTotalFee() {

        return baseFee + insuranceFee ;

    }
}