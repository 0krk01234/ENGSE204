import java.util.Scanner ;
public class lab4point13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String planname ; 

        int maxDuration = input.nextInt();
        Subscription.setMaxDuration(maxDuration);
        input.nextLine();

        planname = input.nextLine();


        int Day1 = input.nextInt();
        int Day2 = input.nextInt();
        int Day3 = input.nextInt();

        Subscription subscription = new Subscription(planname,Day1);
        subscription = subscription.extend(Day2);
        subscription = subscription.extend(Day3);

        subscription.displayInfo();

        input.close();



        

    }
    
}

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365 ;

    public Subscription(String planName , int durationDays) {

        if (durationDays > maxDuration) {

            durationDays = maxDuration ;

        }
        else if (durationDays < 0) {
            durationDays = 0 ;
        }
        this.planName = planName ;
        this.durationDays = durationDays ;
    }

    public Subscription(Subscription other) {

        this.planName = other.planName ;
        this.durationDays = other.durationDays ;
        
    }

    public static void setMaxDuration(int max){

        if(max > 0) {

            maxDuration = max ;
            System.out.println("Max duration set to "+ maxDuration);
            
        }
        else {
            System.out.println("Invalid max policy.");
        }
    }

            public Subscription extend(int days) {

            if (days <= 0) {

                System.out.println("Invalid extension days.");
                return new Subscription(planName , durationDays) ;

            }

            int newdays = this.durationDays + days ;

            if (newdays > maxDuration) {
                System.out.println("Extension failed: Exceeds max policy");
                return new Subscription(planName , durationDays) ;
            } 
            else {
                System.out.println("Extension successful.");
                return new Subscription(planName , newdays);

            }

        }

        public void displayInfo() {
            System.out.println("Plan: " + this.planName + "" + "," + "Days: " + this.durationDays);
        }
}
