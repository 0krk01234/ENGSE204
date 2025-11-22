import java.util.Scanner; 
public class Lab1point5 {

    public static void main(String[] drinkssss) {
        Scanner input = new Scanner(System.in);

        int me = input.nextInt();

        if (me == 1) { 
            System.out.println("Americano");
        }

        else if(me == 2) { 
            System.out.println("Latte");
        }
        
        else if(me == 3 ) {
            System.out.println("Espresso"); 
        }

        else if(me == 4) {
            System.out.println("Mocha"); 
        }

        else {
            System.out.println("Ibvalid Menu"); 
        }
        input.close();
     } 
} 
