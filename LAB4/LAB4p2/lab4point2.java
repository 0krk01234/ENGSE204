import java.util.Scanner;
public class lab4point2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;

        String name ;
        double price ;

        int order = input.nextInt();
        input.nextLine();

        if(order == 1) {
            name = input.nextLine();
            Product P = new Product(name);
            P.displayInfo();
        }
        else if (order == 2) {
            name = input.nextLine();
            price = input.nextDouble();
            Product P = new Product(name , price);
            P.displayInfo();
        }

        input.close();
    }
    
}

class Product {
    private String name ;
    private double price ;

    public Product(String name) {
        this(name , 0.0) ;
    }
    public Product(String name , double price){
        this.name = name ;
        this.price = price ;
    }
    public void displayInfo(){
        System.out.printf("Product : %s Price : %.2f", this.name , this.price);
    }
}
