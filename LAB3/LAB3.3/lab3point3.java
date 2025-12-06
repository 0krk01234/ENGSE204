import java.util.Scanner;
public class lab3point3 {
    
    public static void main (String[] passwordUpdate) {

        Scanner input = new Scanner(System.in);

        String passwordbasic = input.nextLine();
        String newPassword = input.nextLine();

        User U1 = new User(passwordbasic);

        U1.setPassword(newPassword);
        System.out.println(U1.getPassword());

    }
}

class User {
    private String password ;

    public User(String initialPassword) {
        
        this.password = initialPassword ;

    }

    public String getPassword() {
        return this.password ;
    }

    public void setPassword(String newPassword){
        if(newPassword.length() >= 8) {
            this.password = newPassword ;
            System.out.println("Password update.");
        }
        else if (newPassword.length() < 8 || newPassword.length() > 0 ) {
            System.out.println("Password is too short.");
        }
        else {
            System.out.println("Pls enterpassword positive length");
        }
    }
}
