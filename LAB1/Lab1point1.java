      import java.util.Scanner; //import 

      public class Lab1point1 { 
         public static void main(String[] args) { 

         // สร้าง Scanner 

         Scanner input = new Scanner(System.in);

         int Number1 = input.nextInt(); //รับค่า num1
         int Number2 = input.nextInt(); //รับค่า num2
         
         System.out.println(Number1 + Number2); 
         // ปิด Scanner
         input.close();
         }     
      }      