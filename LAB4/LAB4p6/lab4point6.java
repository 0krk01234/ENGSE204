import java.util.Scanner ;

public class Lab4Point6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x , y , dx ,dy;

        System.out.println("Enter X: ");
        x = input.nextInt();

        System.out.println("Enter Y: ");
        y = input.nextInt();

        System.err.println("Enter dx: ");
        dx = input.nextInt();

        System.out.println("Enter dy: "); 
        dy = input.nextInt();

        point p1 = new point(x , y);
        point p2 = p1.move(dx , dy);
        point p3 = p2.move(dx , dy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        input.close();

    }
}

class point {
    private final int x ;
    private final int y ;

    public point(int x , int y) {
        this.x = x ;
        this.y = y ;
    }

    public int getX() {
        return this.x ;
    }

    public int getY(){
        return this.y;
    }

    public point move(int dx , int dy) {
        int newX = this.x + dx ;
        int newY = this.y + dy ;

        return new point(newX , newY) ;
    }

        public void displayInfo() {
            System.out.println(this.x + "," + this.y);
        }
    }
