    import java.util.Scanner; // import
    public class Lab1point11 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //สร้างScanner

            int N = input.nextInt(); // กรอกค่า N

            int[] number = new int [N]; //กำหนดให้ ช่อง arry มีค่า = N 

            for (int i = 0 ; i < N ; i++) { // loop กรอกค่า arry
                number[i] = input.nextInt(); // กรอกค่า arry
            } // end for
            
            int sumArry = sumArry(number); //ส่งค่า numberarry ไปในฟังก์ชั่น
            System.out.println(sumArry); //แสดงผลรวมที่ส่งกลับมาใน mainหลัก
            input.close(); // ปิด Scanner
        }
        public static int sumArry(int [] number) { // ฟังก์ชั่น ผลรวม arry
            int sum = 0;
            for (int i = 0 ; i < number.length ; i ++) { // loop for เพื่อทำการนำค่าใน arry ไปรวมกับ sum
                sum += number[i] ; // รวมค่า sum ใน arry
            } // end for
            return sum; // ส่งค่า sum กลับเข้า main หลัก
        } //  end ฟังก์ชั้น
    
    } // end class
