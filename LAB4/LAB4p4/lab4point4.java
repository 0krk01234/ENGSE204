import java.util.Scanner;
public class lab4point4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double latStart , longStart , newLat ;

        latStart = input.nextDouble();

        longStart = input.nextDouble();

        newLat = input.nextDouble();

        Location L1 = new Location(latStart , longStart);

        Location Copy = new Location(L1);

        L1.setLatitude(newLat);

        L1.displayInfo();

        Copy.displayInfo();
    }
    
}

class Location {
    private double latitude ;
    private double longitude ;

    public Location(double lattitude , double longitude) {
        this.latitude = lattitude ;
        this.longitude = longitude ;
    }

    public Location(Location other) {
        this.longitude = other.longitude;
        this.latitude = other.latitude;
    }

    public void setLatitude(double newLat){
        
        this.latitude = newLat ;

    }

    public void displayInfo() {
        System.out.println("Lat: " + this.latitude + "Lon: " + this.longitude);
    }
}
