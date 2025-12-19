import java.util.Scanner ;
public class lab4point12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name ;
        int Starthour , newHour ;

        name = input.nextLine();
        Starthour = input.nextInt();
        newHour = input.nextInt();

        Schedule S = new Schedule(Starthour);
        EmployeeSchedule Em = new EmployeeSchedule(name , S);
        EmployeeSchedule copy = new EmployeeSchedule(Em);
        S.setHour(newHour);
        Em.displaySchedule();
        copy.displaySchedule();        
    }

}

class Schedule {

    private int hour ;

    public Schedule(int hour) {
        this.hour = hour ;
    }

    public void setHour(int newHour) {

        this.hour = newHour ;

    }

    public int getHour() {

        return this.hour ;

    }

    public Schedule(Schedule copy){
        this.hour = copy.hour ;
    }
}

class EmployeeSchedule {
    private String name ;
    private Schedule schedule ;

    public EmployeeSchedule(String name , Schedule schedule) {

        this.name = name ;
        this.schedule = schedule ;

    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name ;
        this.schedule = other.schedule ;
        schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(this.name + ":" + "" + schedule.getHour() + ":00");
    }

}