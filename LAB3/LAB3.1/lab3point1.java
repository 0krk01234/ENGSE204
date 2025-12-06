import java.util.Scanner ;
public class lab3point1 {
public static void main (String[] inputUser){

    Scanner input = new Scanner(System.in) ;

    String user = input.nextLine();

    User U1 = new User(user);

    System.out.println(U1.getUsername());

    input.close();

    }
}

class User {

    private String username ;

    public User(String user) {
        this.username = user ;
    }

    public String getUsername() {
        return this.username;
    }
}