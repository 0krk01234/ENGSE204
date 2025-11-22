import java.util.Scanner;
public class Lab1point13 {
    public static void main(String[] arry2miti) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        if (r < 1 && c < 1) {
            System.out.println("negative num");
            return;
        }

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int cnt = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        input.close();
    }
}