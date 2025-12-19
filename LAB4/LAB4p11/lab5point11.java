import  java.util.Scanner;
public class lab5point11 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

            String  theme1 , theme2 ;
            boolean darkMode1 , darkMode2 ;
            int fontSize1 , fontSize2 ;

            // 1 - 3
            theme1 = input.nextLine(); 
            fontSize1 = input.nextInt(); 
            input.nextLine();
            darkMode1 = input.nextBoolean();    
            input.nextLine();

            // 4 - 6
            theme2 = input.nextLine();  
            fontSize2 = input.nextInt();
            input.nextLine();
            darkMode2 = input.nextBoolean();    
            input.nextLine();

            Configuration baseConfig = new Configuration(theme1, fontSize1 , darkMode1);
            Configuration userConfig = new Configuration(theme2 , fontSize2 , darkMode2);
            Configuration finalConfig = new Configuration(baseConfig , userConfig) ;

            finalConfig.displaySetting();

            
    }

}

class Configuration {
    private String theme ;
    private int fontSize ;
    private boolean darkMode ;

    public Configuration(String theme , int fontSize , boolean darkMode) {

        this.theme = theme ;
        this.darkMode = darkMode ;

        if (fontSize < 10) {
            this.fontSize = 10 ;
        }

        else if (fontSize > 20) {
            this.fontSize = 20 ;
        }

        else {
            this.fontSize = fontSize ;
        }
    }

    public Configuration(Configuration base , Configuration user) {
        this.theme = user.theme ;
        this.darkMode = user.darkMode ;
        this.fontSize = base.fontSize ;
    }

    public void displaySetting() {
        System.out.println("Theme: " + "" + this.theme + "," + "Size: " + "" + this.fontSize + "," + "Dark: " + this.darkMode);
    }
}

