import java.sql.Time;
import java.util.Scanner;
public class lab4point10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int mode ; 
        int StartHour , endHour ;

        mode = input.nextInt();

        if(mode == 1) {
            Timepereiod T1 = new Timepereiod () ;
            T1.displayPeriod();
        }

        else if (mode == 2 ) {
            StartHour = input.nextInt();
            endHour = input.nextInt();
            Timepereiod T1 = new Timepereiod (StartHour , endHour) ;
            T1.displayPeriod();
        }
        else {
            throw new IllegalArgumentException("Error input!");
        }


    }
    
}

class Timepereiod {
    private int StartHour ;
    private int endHour ;

    public Timepereiod() {
        this(9 , 17);
    }

    public Timepereiod(int StartHour , int endHour) {   
        if(StartHour < 0 ) {
            StartHour = 0 ;
        }
        else if (StartHour > 23) {
            StartHour = 23 ;
        }
        else {
            
        }

        if(endHour < 0 ) {
            endHour = 0 ;
        }
        else if (endHour > 23) {
            endHour = 23 ;
        }
        else {
            
        }

        if(StartHour > endHour) {

            StartHour = StartHour + endHour ;
            endHour = StartHour - endHour ;
            StartHour = StartHour - endHour ;
        }

        this.StartHour = StartHour ;
        this.endHour = endHour ;
    }
    
    public void displayPeriod() {
        System.err.println(+ StartHour +":00" + "" + "" + "-" + "" + endHour + ":00") ;
    }
}
