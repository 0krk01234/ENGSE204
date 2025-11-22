    import java.util.Scanner; 

    public class Lab1point7 {

    public static void main(String[] allarry) {

        Scanner input = new Scanner(System.in); 

        int n = input.nextInt(); 
        int sum = 0 ; 

        for (int i = 0 ; i < n ; i ++) {

            int j = input.nextInt(); 

            sum += j ; 
        } 
        System.out.println(sum); 
        input.close();
    } 
    
} 
