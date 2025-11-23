import java.util.Scanner;

public class Lab1point14 {
    public static void main(String[] bombgames){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();

        int c = in.nextInt();

        char[][] target = new char[r][c];

         for (int x = 0; x < r ; x++){
            for ( int j = 0 ; j < c ; j++){
                target[x][j] = in.next().charAt(0);
            }
         }

        int tlm = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (target[i][j] == '*'){
                    tlm ++;
                }
            }
        }

        System.out.println("Which target you want to select (R = 0,C = 0)");
        int RR = in.nextInt() ;
        int CC = in.nextInt() ;
        int mc = 0;

        if(RR < 0 || RR >= r || CC < 0 || CC >= c){
            System.out.println("1");
            return;
        }

        if (target[RR][CC] == '*') {
            System.out.println("Mine");

        }else{
            if (RR - 1 >= 0 && CC - 1 >= 0) {
                if (target[RR-1][CC-1] == '*'){ 
                    mc++;
                }
            }

            if (RR - 1 >= 0) {
                if (target[RR-1][CC] == '*'){
                    mc++;
                }
            }

            if (RR - 1 >= 0 && CC + 1 < c) {
                if (target[RR-1][CC+1] == '*'){
                    mc++;
                }
            }

            if (CC - 1 >= 0) {
                if (target[RR][CC-1] == '*'){
                    mc++;
                }
            }

            if (CC + 1 < c) {
                if (target[RR][CC+1] == '*'){
                    mc++;
                }
            }

            if (RR + 1 < c && CC - 1 >= 0) {
                if (target[RR+1][CC-1] == '*'){
                    mc++;
                }
            }

            if (RR + 1 < c) {
                if (target[RR+1][RR] == '*'){
                    mc++;
                }
            }

            if (RR + 1 < r && CC + 1 < c) {
                if (target[RR+1][CC+1] == '*'){
                    mc++;
                }
            }

            System.out.println(mc);
        }

    }

}