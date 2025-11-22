import java.util.Scanner; 
public class Lab1point10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        double width = input.nextDouble(); 
        double height = input.nextDouble(); 

        double area = calculateArea(width, height); 

        System.out.println(area);
        input.close(); 
    }

    public static double calculateArea(double width , double height) { 

        double area = width * height ; 

        return area; 

    }  
    
} 
