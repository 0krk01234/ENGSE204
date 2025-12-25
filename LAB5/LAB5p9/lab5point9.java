import java.util.Scanner;
public class lab5point9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        String name ;
        double unitPrice , monthlyCost ;
        int quanity , months ;

        //Product
        name = input.nextLine();
        unitPrice = input.nextDouble();
        input.nextLine();
        quanity = input.nextInt();
        PhysicalProduct P1 = new PhysicalProduct(name, unitPrice, quanity);

        //Subscription
        input.nextLine();
        name = input.nextLine();
        monthlyCost = input.nextDouble();
        input.nextLine();
        months = input.nextInt();
        DigitalSubscription D1 = new DigitalSubscription(name, monthlyCost, months);

        Item[] Item = {P1 , D1} ;

        for(int i = 0 ; i < Item.length ; i ++) {
            
            System.out.println(Item[i].getValue() + Item[i + 1].getValue());

        }
        
        
        input.close();
    }
}

class Item {
    protected String name ;

    public Item(String name) {

        this.name = name ;

    }

    public double getValue() {
        return 0.0 ;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice ;
    protected int quanity ;

    public PhysicalProduct(String name , double unitPrice , int quanity) {

        super(name);
        this.unitPrice = unitPrice ;
        this.quanity = quanity ;

    }

    @Override 
    public double getValue() {
        return this.unitPrice * quanity ;
    }
}

class DigitalSubscription extends Item {

    protected double monthlyCost ;
    protected int months ;

    public DigitalSubscription(String name , double monthlyCost , int months) {

        super(name);
        this.monthlyCost = monthlyCost ;
        this.months = months ;

    }

    @Override
    public double getValue() {
        return monthlyCost * months ;
    }
}