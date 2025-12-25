import java.util.Scanner;
public class lab5point10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //complextask
        String description = input.nextLine();
        int baseHours = input.nextInt();
        input.nextLine();
        double setupFee = input.nextDouble();
        complexTask C1 = new complexTask(description, baseHours, setupFee);

        //simpletask
        input.nextLine(); //clear
        description = input.nextLine();
        setupFee = input.nextDouble();
        simpleTask S1 = new simpleTask(description, baseHours);

        ProjectTask[] ProjectTask = {C1 , S1};

        for(int i = 0 ; i < ProjectTask.length ; i ++) {

            System.out.println(ProjectTask[i].calculateCost());
        }

        input.close();

    }
    
}

class ProjectTask {
    protected String description ;
    protected int baseHours ;

    public ProjectTask(String description , int baseHours) {

        this.description = description ;
        this.baseHours = baseHours ;

    }

    public double calculateCost() {

        return baseHours * 50 ;

    }
}

class complexTask extends ProjectTask {

    protected double setupFee ;

    public complexTask(String descripstop , int baseHours , double setupFee) {

        super(descripstop , baseHours);
        this.setupFee = setupFee ;

    }

    @Override 

    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee ;
    }
}

class simpleTask extends ProjectTask {
    
    public simpleTask (String description , int baseHours ) {

        super(description, baseHours);

    }

    @Override 

    public double calculateCost() {
        return super.calculateCost() ;
    }
}
