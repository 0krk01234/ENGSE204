import java.util.Scanner;
public class lab2point8 {
    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("MODE");
        String mode = input.nextLine();

        System.out.println("Temperature");
        double tep = input.nextDouble();

        if(mode.equals("C_TO_F")) {
            System.out.println(Tempconveter.celsiusToFahrenheit(tep));
        }

        else if(mode.equals("F_TO_C")) {
             System.out.println(Tempconveter.fahrenheitToCelsius(tep));
        }

        else {
            return ;
        }
    }
}


    class Tempconveter {

        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9.0/5.0) + 32 ;
        }

        public static double fahrenheitToCelsius(double fahrenheit){
            return (fahrenheit -32)*5.0/9.0 ;
        }

    }