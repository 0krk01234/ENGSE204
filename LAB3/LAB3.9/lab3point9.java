import java.util.Scanner;
public class lab3point9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minLength1 = input.nextInt(); input.nextLine();
        String user1_name = input.nextLine();
        String user1_pass = input.nextLine();
        String user2_name = input.nextLine();
        String user2_pass = input.nextLine(); 
        int minLength2 = input.nextInt();  input.nextLine();
        String user2_newpass = input.nextLine();

        User.setMinlength(minLength1) ;
        User U1 = new User(user1_name , user1_pass) ;
        User U2 = new User(user2_name , user2_pass) ;
        
        User.setMinlength(minLength2);
        U1.setPassword(user2_newpass);
        System.out.println(U1.getPassword());
        System.out.println(U2.getPassword());

        input.close();

        
    }
}

class User {
    private String username ;
    private String password ;
    private static int minPasswordLength = 8;

    public static void setMinlength(int length) {
        if(length < 4 ) {
            System.out.println("Invalid length");
        }
        else if(length >= 4) {
            minPasswordLength = length ;
            System.out.printf("New min length set to [%d]\n", length);
        }
    }

    public static int getMinlength(){
        return minPasswordLength ;
    }

    public User(String Username , String password){
        this.username = Username ;
        if(password.length() >= minPasswordLength) {
            this.password = password ;
            System.out.println("Creation successful");
        }
        else {

            this.password = "Invalid" ;
            System.out.println("Creation failed.");

        }
    }

    public void setPassword(String newPassword) {

        if(newPassword.length() >= minPasswordLength) {
            this.password = newPassword ;
            System.out.println("Update successful.");
        }
        else {
            System.out.println("Update Failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }
}
