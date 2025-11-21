    import java.util.Scanner; // import 

    public class Lab1point7 {

    public static void main(String[] args) { // main หลัก

        Scanner input = new Scanner(System.in); // สร้าง Scanner

        int N = input.nextInt(); // รับค่า N 
        int Sum = 0 ; // กำหนดตัวแปร Sum = 0

        for (int i = 0 ; i < N ; i ++) { // loop for ที่เริ่มตั้งแต่ ครั้งที่ 0 แล้วจบเมื่อ น้อยกว่า จำนวน N

            int j = input.nextInt(); // รับค่า J เพื่อนำไปบวกกับ Sum ให้ได้ผลรวม

            Sum += j ; // นำค่า J ไปบวกกับ Sum จนกว่าจะจบ loop

        } // end for
        System.out.println(Sum); // แสดงค่าผลรวม
        input.close(); // ปิด Scanner
    } // end main
    
} // end class
