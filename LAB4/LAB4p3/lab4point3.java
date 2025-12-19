import java.util.Scanner;
public class lab4point3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Player ; 
        int Level ;

        int mode = input.nextInt();
        input.nextLine();

        if(mode == 1) {

            Player Pl = new Player();
            Pl.displayInfo();
        }

        else if (mode == 2) {

            Player = input.nextLine();
            Level = input.nextInt();
            Player Pl = new Player(Player , Level);
            Pl.displayInfo();
        }
        input.close();
    }
}

class Player {
    
    private String username ;
    private int level ;

    public Player(){
        this.username = "Guest" ;
        this.level = 1 ;
    }

    public Player(String username , int level) {
        this.username = username ;
        this.level = level ;
    }
    
    public void displayInfo(){
        System.out.printf("User: [%s] , Level: [%d]", this.username , this.level);
    }
}