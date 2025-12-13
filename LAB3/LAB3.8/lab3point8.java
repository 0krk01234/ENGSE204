import java.util.Scanner;
public class lab3point8 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nameProduct = input.nextLine();
        
        int startStock = input.nextInt();

        InventoryItem Item = new InventoryItem(nameProduct , startStock);

        int N = input.nextInt();
        input.nextLine();
        int add ;
        int sell ;

        for (int i = 0 ; i < N ; i ++) {
            
            String addorsell = input.nextLine();

            switch (addorsell) {

                case "ADD":

                    add = input.nextInt();
                    Item.addStock(add);
                    input.nextLine();
                    break;

                case "SELL":

                    sell = input.nextInt();
                    Item.sellStock(sell);
                    input.nextLine();
                    break;

                default:
                    System.out.println("error INPUT");
                    return ;
            }
        }
        System.out.println("Final Stock: " + Item.getStock());
        input.close();
    }
}

class InventoryItem {
    private String productName ;
    private int stock ;

    public InventoryItem(String productName , int initiallStock) {
        
        if(initiallStock >= 0) {
            this.stock = initiallStock ;
        }

        else {
            this.stock = 0 ;
        }
    }

    public String getProductName(){
        return this.productName ;
    }

    public int getStock() {
        return this.stock ;
    }

    public void addStock(int amount){
        if(amount > 0) {
            this.stock += amount ;
            System.out.println("Stock added.");
        }
        else if (amount <= 0 ) {
            System.out.println("Invalid amount");
        }
    }

    public void sellStock(int amount) {
        if(amount > 0 && amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        }
        else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        }
        else if (amount <= 0){
            System.out.println("Invalid amount");
        }
    }

}
