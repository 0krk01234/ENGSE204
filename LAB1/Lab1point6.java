import java.util.Scanner;

public class Lab1point6 {
        public static void main (String[] args) {

            Scanner input = new Scanner(System.in); // สร้าง Scanner เพื่อรับค่าตัวคูณ

            int multiplicationTable = input.nextInt(); // รับค่าตัวคูณ

            if(multiplicationTable >=1 && multiplicationTable <= 12 ) { // เงื่อนไขถ้าเลขที่รับค่าอยู่ในระหว่าง 1-12
                for(int i = 1 ; i <= 12 ; i++) { // loop ตัวคูณ
                    System.out.printf("%d x %d = %d\n", multiplicationTable , i , (multiplicationTable * i)); // แสดงข้อความและ ผลคูณ ของ ตัวแปร I และ multiplicationTable
                } // end for
            } // end if

            else{
                System.out.println("Invalid Table");
            } // end else
            
        } // end main
    } // end class

