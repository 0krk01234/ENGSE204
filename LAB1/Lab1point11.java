    import java.util.Scanner; 
    public class Lab1point11 {

        public static void main(String[] sumarrrr) {
            Scanner input = new Scanner(System.in); 

            int N = input.nextInt(); 

            int[] number = new int [N]; 

            for (int i = 0 ; i < N ; i++) { 
                number[i] = input.nextInt(); 
            } 
            
            int sumArry = sumArry(number); 
            System.out.println(sumArry); 
            input.close(); 
        }
        public static int sumArry(int [] ber) {
            int sum = 0;
            for (int i = 0 ; i < ber.length ; i ++) { 
                sum += ber[i] ;
            }
            return sum; 
        } 
    
    } 