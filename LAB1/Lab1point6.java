import java.util.Scanner;

public class Lab1point6 {
        public static void main (String[] args) {

            Scanner input = new Scanner(System.in); 

            int multi = input.nextInt(); 

            if(multi >=1 && multi <= 12 ) {
                for(int i = 1 ; i <= 12 ; i++) { 
                    System.out.printf("%d x %d = %d\n", multi , i , (multi * i));
                } 
            } 

            else{
                System.out.println("Invalid Table");
            } 
            
        } 
    } 

