    import java.util.Scanner;
    public class Lab1point9 {

        public static void main(String[] allarrysmsm) {
            
            Scanner input = new Scanner(System.in); 
            int N = input.nextInt();
            int[] numBer = new int[N]; 
            double Sum = 0 ;

            for (int i = 0 ; i < N ; i++) {
                numBer[i] = input.nextInt(); 
                Sum += numBer[i]; 
            } 

            System.out.println(Sum/N); 
            input.close(); 
        } 
    }
