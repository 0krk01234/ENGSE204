import java.util.Scanner; // import
public class Lab1point4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //สร้าง Scanner

        int score = input.nextInt(); // รับค่าคะแนน

        if (score >= 80 && score <= 100) { // เงื่อนไขเมื่อคะแนนอยู่ในระหว่าง 80-100
            System.out.println("A"); //แสดงข้อความ
        }
        else if (score >= 70 && score <= 79) { // เงื่อนไขเมื่อคะแนนอยู่ในระหว่าง 70-79
            System.out.println("B"); //แสดงข้อความ
        }
        else if (score >= 60 && score <= 69) { // เงื่อนไขเมื่อคะแนนอยู่ในระหว่าง 60-69
            System.out.println("C"); //แสดงข้อความ
        }
        else if (score >= 50 && score <= 59) { // เงื่อนไขเมื่อคะแนนอยู่ในระหว่าง 50-59
            System.out.println("D"); // แสดงข้อความ
        }
        else if (score >= 0 && score <= 49) { // เงื่อนไขเมื่อคะแนนอยู่ในระหว่าง 0-49
            System.out.println("F"); //แสดงข้อความ
        }
        input.close(); // ปิด Scanner
    } // end main
} // end class