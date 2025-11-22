import java.util.Scanner; // import
public class Lab1point10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // สร้าง Scanner

        double width = input.nextDouble(); // รับค่า width
        double height = input.nextDouble(); // รับค่า height

        double area = calculateArea(width, height); // นำตัวแปร width และ height เข้าฟังก์ชั่น

        System.out.println(area); // แสดงผล area
        input.close(); // ปิด Scanner
    }

    public static double calculateArea(double width , double height) { // ฟังก์ชั่น หา area

        double area = width * height ; // นำ width และ height คูณกันเพื่อหาผลรวม area

        return area; // return ผลลัพธ์ area กลับไป main หลัก

    } // end ฟังก์ชั้น calculateArea 
    
} // end class
