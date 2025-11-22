    import java.util.Scanner; 

    public class Lab1point8 {
        public static void main(String[] mmaxx) {

            Scanner input = new Scanner(System.in); 

            int N = input.nextInt();

            int[] numBer = new int[N]; 

            for (int i = 0 ; i < N ; i ++) { 

                numBer[i] = input.nextInt();

            } 

            int Max = 0 ;

            for (int i = 0 ; i < N ; i++) { 
                if (numBer[i] > Max) { 
                    Max = numBer[i] ; 
                } 
            } 
            System.out.println(Max); 
            input.close();
        }  
} 
