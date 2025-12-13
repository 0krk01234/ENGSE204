import java.util.Scanner;
public class lab3point13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        int N = input .nextInt() ;
        input.nextLine();

            for (int i = 0 ; i < N ; i ++) {
                System.out.println("Enter order: ");
                String order = input.nextLine();

                if(order.equals("SET")) {
                    int kota = input.nextInt(); input.nextLine();
                    
                    LicensesManager.setMax(kota) ;
                }

                else if (order.equals("CHECKOUT")) {
                    LicensesManager.checkOut();
                }

                else if (order.equals("CHECKIN")) {
                    LicensesManager.checkIn();
                }

                else if (order.equals("STATUS")) {
                    LicensesManager.displayStatus();
                }
            }

    }
    
}

class LicensesManager {
    private static int maxLicenses = 10;
    private static int usedLincenses = 0;

    public static void setMax(int max) {
        if (max < 0 ) {
            System.out.println("Invalid max value.");
        }
        else if (max < usedLincenses) {
            System.out.println("Cannot set max lower than current usage.");
        }
        else {
            maxLicenses = max ;
            System.out.println("Max licenses set to " + max);
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
