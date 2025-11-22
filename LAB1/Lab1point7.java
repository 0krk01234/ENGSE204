    import java.util.Scanner; 

    public class Lab1point7 {

    public static void main(String[] allarry) {

        Scanner input = new Scanner(System.in); 

        int N = input.nextInt(); 
        int Sum = 0 ; 

        for (int i = 0 ; i < N ; i ++) {

            int j = input.nextInt(); 

            Sum += j ; 

        } 
        System.out.println(Sum); 
        input.close();
    } 
    
} 
