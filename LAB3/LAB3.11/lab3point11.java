import java.util.Scanner;
public class lab3point11 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();
        for(int i = 0 ; i < N ; i++) {
            String order = input.nextLine();

            if(order.equalsIgnoreCase("SET_URL")) {
                SystemConfig config = SystemConfig.getInstance();
                String url = input.nextLine();
                config.setSeverUrl(url);
            }
            else if(order.equalsIgnoreCase("SET_MAX")) {
                SystemConfig config = SystemConfig.getInstance();
                int Maxcount = input.nextInt() ;
                input.nextLine();
                config.setMaxConnection(Maxcount);
            }
            else if (order.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL:" + config.getSeverUrl() );
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
    }
    
}

class SystemConfig {
    private static SystemConfig instance ;
    private String severUrl ;
    private int maxConnections ;

    private SystemConfig() {
        this.severUrl = "default.sever.com" ;
        this. maxConnections = 10 ;
    }

    public static SystemConfig getInstance() {
        if(instance == null) {
        instance = new SystemConfig();
        }
        return instance ;
    }

    public String getSeverUrl() {
        return this.severUrl ;
    }

    public void setSeverUrl(String url) {
        this.severUrl = url ;
    }

    public int getMaxConnections() {
        return this.maxConnections ;
    }

    public void setMaxConnection (int count) {
        if(count > 0 ) {
            this.maxConnections = count ;
            System.out.println("Max connections set.");
        }
        else {
            System.out.println("Invalid count");
        }
    }

    

}
