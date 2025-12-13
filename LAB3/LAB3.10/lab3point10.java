import java.util.Scanner;

public class lab3point10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int N = input.nextInt();
        input.nextLine();

        for (int i = 0 ; i < N ; i ++) {
               String order = input.nextLine();

            switch (order) {

                case "SET":
                    int newLevel = input.nextInt();
                    input.nextLine();
                    SystemLogger.setLogLevel(newLevel);
                    break;

                case "LOG":
                    int level = input.nextInt();
                    input.nextLine();
                    String message = input.nextLine();
                    SystemLogger.log(level, message);
                    break;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
    
}

class SystemLogger {
    private static int cueerntLogLevel = 1 ;

    private static String getLevelName(int level) {
        switch (level) {
            case 1:

                return "INFO" ;

            case 2:

                return "DEBUG" ;

            case 3:

                return "ERROR" ;
        
            default:
                return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if(newLevel >=1 && newLevel <= 3){
            cueerntLogLevel = newLevel ;
        }
        else {
            System.out.println("Invallid log level.");
        }
    }

    public static void log(int messageLevel , String message) {
        if(messageLevel >= cueerntLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]" + message);
        }
    }
}
