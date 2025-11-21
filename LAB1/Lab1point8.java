    import java.util.Scanner; // import

    public class Lab1point8 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in); // สร้าง Scanner

            int N = input.nextInt(); //  รับค่าตัวแปร N

            int[] numBer = new int[N]; // กำหนดตัวแปร numBer ให้มีจำนวน arry เท่ากับ ตัวแปร N ที่รับค่ามา

            for (int i = 0 ; i < N ; i ++) { // loop รับค่าเข้าไปใน arry

                numBer[i] = input.nextInt(); //รับค่า ใน arry numBer

            } // end for

            int Max = 0 ; // สร้างตัวแปร Max = 0

            for (int i = 0 ; i < N ; i++) { // loop หาค่า Max ใน arry
                if (numBer[i] > Max) { // จะเข้าเงื่อนไขเมื่อ numBer[i] มีค่ามากกว่า Max
                    Max = numBer[i] ; // กำหนดให้ Max มีค่าเท่ากัย arry numBer
                } // end if
            } // end for
            System.out.println(Max); // แสดงค่า Max
            input.close(); // ปิด Scanner
        }  // end main
} // end class
