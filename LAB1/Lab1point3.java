   
   
    import java.util.Scanner; 
    public class Lab1point3 {
        public static void main (String[] evenadnodd) { 

        Scanner input = new Scanner(System.in); 

        int numbee = input.nextInt(); 

        if (numbee % 2 == 0) {
            System.out.println("Even"); 
        }

        else {
            System.out.println("Odd"); 
        }
        input.close(); 
        }
    } 
