import java.util.Scanner;
public class lab3point5 {

    public static void main (String[] connectSever) {
        Scanner input = new Scanner (System.in) ;

        String connectionString = input.nextLine();

        DatabaseConnection D1 = new DatabaseConnection(connectionString);

        D1.connect() ;
        D1.disconnect();
        D1.disconnect();
        System.out.println(D1.isConnected());
    }
    
}

class DatabaseConnection {
    private String connectionString ;
    private boolean connected ;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString ;
        this.connected = false ;
    }

    public boolean isConnected(){
        return this.connected;
    }

    public void connect() {
        if (this.connected == false) {
            this.connected = true ;
            System.out.printf("Connected to %s " , this.connectionString);
        }
        if (this.connected == true){
            System.out.println("Already connected");
        }
    }

    
    public void disconnect() {
        if(this.connected == true) {
            this.connected = false ;
            System.out.println("Disconnected.");
        }
        else {
            System.out.println("Already disconnected.");
        }
    }

}
