import java.util.Scanner; 
public class lab4point8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        input.nextLine();

        String title , director ;

        double rating ;

        if (mode == 1) {
            title = input.nextLine();
            Movie M = new Movie(title);
            M.displayDetails();
        }

        else if (mode == 2) {

            title = input.nextLine();
            director = input.nextLine();
            Movie M = new Movie(title , director);
            M.displayDetails();
        }

         else if (mode == 3) {
            
            title = input.nextLine();
            director = input.nextLine();
            rating = input.nextDouble();
            Movie M = new Movie(title , director , rating);
            M.displayDetails();
        }

        
    }
}

class Movie {

    private String title ;
    private String director ;
    private double rating ;

    public Movie(String title) {
        this(title , "Unlnow" , 0.0) ;
    }

    public Movie(String title , String director) {
        this(title , director , 0.0) ;
    }

    public Movie(String title, String director , double rating) {
        this.title = title ;
        this.director = director ;

        if(rating > 10) {
            this.rating = 10 ;
        }

        else if (rating < 0) {
            this.rating = 0 ;
        }

        else {
            this.rating = rating ;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title + "," + "Director: " + this.director + "," + "Rating: " + this.rating);
    }
}
