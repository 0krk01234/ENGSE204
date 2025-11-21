   
   
    import java.util.Scanner; // สร้าง import
    public class Lab1point3 {
        public static void main (String[] args) { 

        Scanner input = new Scanner(System.in); // สร้าง Scanner เพื่อรับค่า 

        int numBer = input.nextInt(); // รับค่าเลข

        if (numBer % 2 == 0) {
            System.out.println("Even"); //แสดงผลเมื่อเป็นเลขคู่
        }

        else {
            System.out.println("Odd"); // แสดงผลเมื่อเป็นเลขคี่
        }
        input.close(); //ปิด Scanner
        } // end main
    } // End class

