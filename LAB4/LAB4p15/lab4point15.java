import java.util.Scanner;
public class Lab4Point15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;


        int max = input.nextInt() ;
        AuditRecord.setPolicy(max);
        input.nextLine();

        String user = input.nextLine();
        AuditRecord au = new AuditRecord(user);


        int n = input.nextInt();
        input.nextLine();

        for (int i = 0 ; i < n ; i ++) {
            String maxMessages = input.nextLine();
            au = au.addMessage(maxMessages);
        }

        au.displayLog();
        input.close();
    }
}

class AuditRecord {

    private final String user ;
    private final String[] logMessages ;
    private static int maxMessages = 3 ;

    public AuditRecord(String user) {

        this(user , new String[0]);

    }

    public AuditRecord(String user , String[] logs) {

        this.user = user ;
        int count ;

        if(logs.length > maxMessages) { 

           count = maxMessages ;

        }
        else {
            count = logs.length ;
        }

        this.logMessages = new String[count];

        int copy = logs.length - count ;
        for (int i = 0 ; i < count ; i ++) {
            this.logMessages[i] = logs[copy + i];
        }
    }

    public static void setPolicy(int max) {
        
        if(max > 0) {
            maxMessages = max ;
            System.out.println("Policy set to " + ":" + max);
        }
        else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {

        if(this.logMessages.length < maxMessages) {

            String[] arr = new String[this.logMessages.length + 1];

            for(int i = 0 ; i < this.logMessages.length ; i ++) {

                arr[i] = this.logMessages[i] ;
                
            }
            
            arr[this.logMessages.length] = message; 
            return new AuditRecord(user, arr);

        }
        else {
            System.out.println("Log is full");
            return this;
        }
    }

    public void displayLog() {

        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);

            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}