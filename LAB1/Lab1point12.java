import java.util.Scanner;
public class Lab1point12 {
    
    public static void main (String[] sinka) {

        Scanner input = new Scanner(System.in) ;

        int N = input.nextInt();

        int[] ID = new int [N + 1];
        int[] Stock = new int[N + 1];

        for(int i = 1 ; i < N + 1 ; i ++) {

            ID[i] = input.nextInt();
            
            Stock[i] = input.nextInt();
        }

        System.out.print("pass");
        int serch = input.nextInt();

        boolean cchek = false;

        for (int i = 1; i <= N; i++) {
            if (serch == ID[i]) {
            System.out.printf(" %d", Stock[i]);
            cchek = true;
            break;
            }
        }

        if (!cchek) {
            System.out.printf("Product %d not found\n", serch);
        }

    }
}
