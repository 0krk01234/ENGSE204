
import java.util.Scanner;
public class LAB2p10 {
    public static void main(String[] Shopppppp){

        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int N = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i < N ; i++){

            System.out.println("Product");
            String nameprod = input.nextLine();

            System.out.println("Price");
            double priice = input.nextDouble();
            input.nextLine();

            product P1 = new product(nameprod , priice);
            cart.addProduct(P1);
        }

        System.out.println(cart.calculateTotalPrice());
        input.close();
        
    }
}



