import java.util.Scanner; 
public class Lab1point10 {

    public static void main(String[] areaaaa) {
        Scanner input = new Scanner(System.in); 

        double wid = input.nextDouble(); 
        double high = input.nextDouble(); 

        double area = calculateArea(wid, high); 

        System.out.println(area);
        input.close(); 
    }

    public static double calculateArea(double width , double height) { 

        double area = width * height ; 

        return area; 

    }  
    
} 
