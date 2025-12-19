import java.util.Scanner;
public class lab4point5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int R,G,B ;

        R = input.nextInt();

        G = input.nextInt();

        B = input.nextInt();

        Color C = new Color (R ,  G , B) ;

        C.displayRGB();      
    }
}

class Color {
    private final int red ;
    private final int green ;
    private final int blue ;

    public Color(int r , int g , int b) {

        //set R in constructor
        if (r < 0) {
            this.red = 0 ;
        }

        else if (r > 255) {
            this.red = 255 ;
        }

        else {
            this.red = r ;
        }

        // set G in constructor

        if (g < 0) {
            this.green = 0 ;
        }

        else if (g > 255) {
            this.green = 255 ;
        }

        else {
            this.green = g ;
        }

        // set B in constructor

        if (b < 0) {
            this.blue = 0 ;
        }

        else if (b > 255) {
            this.blue = 255 ;
        }

        else {
            this.blue = b ;
        }
    }

    public int getRed() {
        return this.red ;
    }

    public int getGreen() {
        return this.green ;
    }

    public int getBlue() {
        return this.blue;
    }

    public void displayRGB() {
        System.out.println("R=" + getRed() + "," + "G=" + getGreen() + "," + "B=" + getBlue());
    }
}