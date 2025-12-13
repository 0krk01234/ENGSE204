import java.util.Scanner;

public class Lab3Point13 {
    public static void main(String[] licensemana){

        Scanner input = new Scanner(System.in);

        int  set = input.nextInt();

        input.nextLine();

        for(int i = 0 ; i < set ; i ++){

            String cmd = input.nextLine().trim();

            if (cmd.equalsIgnoreCase("SET")){

                System.out.println("Set Licenses ");
                int max = input.nextInt();

                LicenseManager.SetMax(max);

                input.nextLine();

            }else if (cmd.equalsIgnoreCase("CHECKOUT")){

                LicenseManager.checkOut();

            }else if (cmd.equalsIgnoreCase("CHECKIN")){

                LicenseManager.checkIn();

            }else if (cmd.equalsIgnoreCase("STATUS")){

                LicenseManager.displayStatus();
                
            }else{

                System.out.println("Invalid Input");
                i--;

            }
        }


        input.close();
    }
    

}

    class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void SetMax(int max){

        if ( max < 0 ){

            System.out.println("Invalid max value.");

        }else if ( max < usedLicenses ){

            System.out.println("Cannot set max lower than current usage.");

        }else{
             
            maxLicenses = max;
            System.out.println("Max Licenses set to " + max);

        }
    }

    public static boolean checkOut(){

        if ( usedLicenses < maxLicenses ){

            usedLicenses ++;
            System.out.println("Checkout successful.");
            return true;

        }else{

            System.out.println("Checkout failed: No licenses available.");
            return false;
        }

    }

    public static void checkIn(){
        
        if ( usedLicenses > 0){

            usedLicenses--;
            System.out.println("Check-in successful.");

        }else{

            System.out.println("Nothing to check-in.");

        }
    }

    public static void displayStatus(){

        System.out.println("Used : " + usedLicenses);
        System.out.println("Available : " + (maxLicenses - usedLicenses));

    }
    
}