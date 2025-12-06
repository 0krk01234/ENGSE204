import java.util.Scanner;
public class lab3point4 {

    public static void main(String[] product) {
        
        Scanner input = new Scanner (System.in) ;

        int N = input.nextInt();
        input.nextLine();

        for (int i = 0 ; i < N ; i++) {
            String Product = input.nextLine();
            Product P1 = new Product(Product) ;
        }

        System.out.println(Product.getProductCount());
    }
    
}

class Product {
    private String name ;
    private static int productCount = 0 ;

    public Product(String name) {
        this.name = name ;
        productCount ++ ;
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount(){
        return productCount ;
    }
}
