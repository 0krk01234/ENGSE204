
        import java.util.Scanner; //import 

        public class Lab1point2 { 
         public static void main(String[] args) { 

         // สร้าง Scanner 

         Scanner input = new Scanner(System.in);

         double Width = input.nextDouble(); //รับค่า ความกว้าง
         double Height = input.nextDouble(); //รับค่า ความสูง
         
         System.out.println(Width * Height); //แสดง area
         // ปิด scanf 
         input.close();
         }     
      }      
