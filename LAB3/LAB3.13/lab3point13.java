import java.util.Scanner;
public class lab3point13 {

    public static void main(String[] orderrrrrrrd) {

     Scanner input = new Scanner(System.in) ;

        int N = input .nextInt() ;
        input.nextLine();

            for (int i = 0 ; i < N ; i ++) {
                System.out.println("Enter order: ");
                String orderee = input.nextLine();

                if(orderee.equals("SET")) {
                    int kota = input.nextInt(); input.nextLine();
                    
                    LicensesManager.setMax(kota) ;
                }

                else if (orderee.equals("CHECKOUT")) {
                    LicensesManager.checkOut();
                }

                else if (orderee.equals("CHECKIN")) {
                    LicensesManager.checkIn();
                }

                else if (orderee.equals("STATUS")) {
                    LicensesManager.displayStatus();
                }
            }
            input.close();
    }
    
}

class LicensesManager {
    private static int maxLicenses = 10;
    private static int usedLincenses = 0;

    public static void setMax(int maxd) {
        if (maxd < 0 ) {
            System.out.println("Invalid max value.");
        }
        else if (maxd < usedLincenses) {
            System.out.println("Cannot set max lower than current usage.");
        }
        else {
            maxLicenses = maxd ;
            System.out.println("Max licenses set to " + maxd);
        }
    }

    public static boolean checkOut() {

        if(usedLincenses < maxLicenses) {
            usedLincenses += 1 ;
            System.out.println("Checkout successful.");
            return true ;
        }
        else {
            System.out.println("C้eckout failed: Nolicenses availaable");
            return false ;
        }
    }

    public static void checkIn(){
        if(usedLincenses > 0) {
            usedLincenses -= 1 ;
            System.out.println("Check-in successful.");
        }
        else if (usedLincenses <= 0) {
            System.out.println("Nothig to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used:" + usedLincenses)
        System.out.println("Availavle: " + (maxLicenses - usedLincenses));
    }
 }
