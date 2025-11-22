import java.util.Scanner;

public class Lab1point6 {
        public static void main (String[] args) {

            Scanner input = new Scanner(System.in); 

            int multiplicationTable = input.nextInt(); 

            if(multiplicationTable >=1 && multiplicationTable <= 12 ) {
                for(int i = 1 ; i <= 12 ; i++) { // loop ตัวคูณ
                    System.out.printf("%d x %d = %d\n", multiplicationTable , i , (multiplicationTable * i));
                } 
            } 

            else{
                System.out.println("Invalid Table");
            } 
            
        } 
    } 

