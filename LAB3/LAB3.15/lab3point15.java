import java.util.Scanner;
public class lab3point15 {
    
    public static void main(String[] setpassandlogin) {
        
        Scanner input = new Scanner(System.in) ;
        String username = input.nextLine() ;
        User U1 = new User(username);
        input.nextLine();
        int N = input.nextInt();

        for(int i = 0 ; i < N ; i ++) {

            String order = input.nextLine();

            if(order.equals("SET_POLICY")) {
                int countMax = input.nextInt();
                User.setPolicy(countMax);
            }
            else if (order.equals("LOGIN")) {
                String password = input.nextLine();
                U1.login(password);
            }
            else {
                throw new IllegalArgumentException("Error order");
            }

        }
    }
}

class User {
    private String username ;
    private int failedAttempts ;
    private boolean isLocked ;
    private static int maxAttempts =3;

    public User(String username ) {
        this.username = username ;
        this.failedAttempts = 0 ;
        this.isLocked = false ;
    }

    public static void setPolicy(int max){
        if(max > 0) {
            maxAttempts = max ;
            System.out.println("Policy updated.");
        }
        else {
            throw new IllegalArgumentException("Invalid policy.");
        }
    }
    public String getUsername() {
        return this.username ;
    }
    public boolean isLocked(){
        return this.isLocked;
    }
    public int getFailedAttempts() {
        return this.failedAttempts ;
    }
    public void login(String password) {
        if(isLocked == true) {
            System.out.println("Account is locked.");
        }
        else if (this.isLocked == false && password.equals("pass123")){
            this.failedAttempts = 0 ;
            System.out.println("Login successful.");
        }
        else if (this.isLocked == false && !password.equals("pass123")) {
            this.failedAttempts ++ ;
            if(this.failedAttempts >= maxAttempts) {
                this.isLocked = true ;
                System.out.println("Login failed. Account locked.");
            }
            else {
                maxAttempts = (maxAttempts - this.failedAttempts) ;
                System.out.printf("Login failed.[%d] attempts.left" , maxAttempts);
            }
        }
    }
}
