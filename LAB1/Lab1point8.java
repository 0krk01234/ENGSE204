    import java.util.Scanner; 

    public class Lab1point8 {
        public static void main(String[] mmaxx) {

            Scanner input = new Scanner(System.in); 

            int n = input.nextInt();

            int[] numpee = new int[n]; 

            for (int i = 0 ; i < n ; i ++) { 

                numpee[i] = input.nextInt();

            } 

            int x = 0 ;

            for (int i = 0 ; i < n ; i++) { 
                if (numpee[i] > x) { 
                    x = numpee[i] ; 
                } 
            } 
            System.out.println(x); 
            input.close();
        }  
} 
