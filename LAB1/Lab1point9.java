    import java.util.Scanner; // import
    public class Lab1point9 {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in); // สร้าง Scanner
            int N = input.nextInt();// รับค่าN
            int[] numBer = new int[N]; // กำหนดให้ aary มี = จำนวนN
            double Sum = 0 ; //กำหนดตัวแปร Sum เป็น ทศนิยม และมีค่า = 0

            for (int i = 0 ; i < N ; i++) { // for กรอกค่าตัวเลขใน arry
                numBer[i] = input.nextInt(); //รับค่าตัวเลขเข้า arry numBer
                Sum += numBer[i]; // กำหนดให้ นำค่า arry numBer[i] ไปเก็บหรือบวกไว้ในค่า Sum เพื่อนำไปหาค่าเฉลี่ย
            } //end for

            System.out.println(Sum/N); //แสดงค่าเฉลี่ย โดยนำ Sum หาร N
            input.close(); // ปิด Scanner
        } // end main 
    }// end class
