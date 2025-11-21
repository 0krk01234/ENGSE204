import java.util.Scanner; // สร้าง import
public class Lab1point5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// สร้าง Scanner รับค่า 

        int menuNumber = input.nextInt(); // รับค่าเมนู

        if (menuNumber == 1) { //แสดงผลเมื่อกรอกตัวเลข 1
            System.out.println("Americano");
        }

        else if(menuNumber == 2) { //แสดงผลเมื่อกรอกตัวเลข 2
            System.out.println("Latte");
        }
        
        else if(menuNumber == 3 ) {
            System.out.println("Espresso"); //แสดงผลเมื่อกรอกตัวเลข 3
        }

        else if(menuNumber == 4) {
            System.out.println("Mocha"); //แสดงผลเมื่อกรอกตัวเลข 4
        }

        else {
            System.out.println("Ibvalid Menu"); //แสดงผลเมื่อกรอกตัวเลขที่ไม่อยู่ในเมนู
        }
        input.close(); // ปิด Scanenr 
     } // end main
    
} // end class
