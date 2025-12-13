import java.util.Scanner;
public class LAB2p11 {

    public static void main(String[] carsup) {
        

    Scanner input = new Scanner (System.in);

    String car = input.nextLine();

    int year = input.nextInt();

    int update = input.nextInt();

    Car C1 = new Car (car , year);

    C1.setYear(update);

    System.out.println("Model: " + C1.getModel());
    System.out.println("Year: " + C1.getYear());

    input.close();

    }
    
}

class Car {
    private String model ;
    private int year ;

    Car (String namecar , int yearr) {
        this.model = namecar;
        this.year = yearr;
    }

    public String getModel () {
        return this.model;
    }

    public int getYear () {
        return this.year;
    }

    public void setYear (int yearr) {

        this.year = yearr ;
    }
}
