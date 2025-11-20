   // import 
   import java.util.Scanner; 
      public class LAB1 { // BIG BOX
         public static void main(String[] args) { 

         // สร้าง Scanner 

         Scanner input = new Scanner(System.in);

         System.out.print("Enter Number1: "); 
         int Number1 = input.nextInt(); 

         System.out.print("Enter Number2: "); 
         int Number2 = input.nextInt(); 
         
         System.out.println("\n "+ (Number1 + Number2)); 
         // ปิด scanf 
         input.close();
 } 
}     