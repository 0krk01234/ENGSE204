import java.util.Scanner;
public class Lab3Point2 {
    public static void main (String[] upgate_Score) {

        Scanner input = new Scanner(System.in);

        int initialScore = input.nextInt();
        int scoreUpdate = input.nextInt();

        Player P1 = new Player (scoreUpdate) ;

        P1.setScore(scoreUpdate);

        System.out.println(P1.getScore());
        
        input.close();
    }
}

class Player {
    
    private int score ;

    public Player(int initialScore) {

        this.score = initialScore ;

        }

        public int getScore() {

            return this.score ;

        }

        public  void setScore(int newScore) {

            if (newScore > this.score) {
                this.score = newScore ;
            }

    }


}