import java.util.Scanner;
public class lab5point13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name ;

        User u1 = new User("Guest"); // ObUser

        name = input.nextLine();
        int project = input.nextInt();
        input.nextLine();

        Developer d1 = new Developer(name, project); // ObDev

        

        name = input.nextLine();
        project = input.nextInt();
        input.nextLine();
        String adminKey = input.nextLine();

        Admin a1 = new Admin(name, project, adminKey); // ObAdmin

        User[] User = {u1 , d1 , a1} ;

        int totalClearance = 0 ;

        for(int i = 0 ; i < User.length ; i ++) {

            totalClearance += User[i].getClearanceLevel();

        }

        for (int i = 0 ; i < User.length ; i ++) {

            if(User[i] instanceof Admin) {

                Admin admin1 = (Admin) User[i];
                System.out.println(admin1.getAdminKey());

            }
        }

        System.out.println(totalClearance);


    }
    

}

class User {
    protected String name ;

    public User(String name ) {
        this.name = name ;
    }

    public int getClearanceLevel() {
        return 1 ;
    }
}

class Developer extends User {

    protected int projects ;

    public Developer(String name , int projects) {

        super(name); 
        this.projects = projects ;

    }

    @Override
    public int getClearanceLevel() {
        return 2 ;
    }
}

class Admin extends Developer {

    protected String adminKey ;

    public Admin(String name , int projects , String adminKey) {

        super(name, projects);
        this.adminKey = adminKey ;

    }

    @Override
    public int getClearanceLevel() {
        return 3 ;
    }

    public String getAdminKey() {
        return this.adminKey ;
    }
}
