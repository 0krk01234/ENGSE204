import java.util.Scanner; // สร้าง import
public class Lab1point5 {

    public static void main(String[] drinkssss) {
        Scanner input = new Scanner(System.in);

        int menuNumber = input.nextInt();

        if (menuNumber == 1) { 
            System.out.println("Americano");
        }

        else if(menuNumber == 2) { 
            System.out.println("Latte");
        }
        
        else if(menuNumber == 3 ) {
            System.out.println("Espresso"); 
        }

        else if(menuNumber == 4) {
            System.out.println("Mocha"); 
        }

        else {
            System.out.println("Ibvalid Menu"); 
        }
        input.close();
     } 
} 
