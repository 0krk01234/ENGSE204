import java.util.Scanner;
public class lab4point14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String gameName = input.nextLine();
        int score1 , score2 , score3 ;

        score1 = input.nextInt();
        score2 = input.nextInt();
        score3 = input.nextInt();

        int originalScore[] = {score1 , score2 , score3} ;

        ScoreBoard sb1 = new ScoreBoard(gameName , originalScore);

        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScore[0] = input.nextInt();

        sb1.displayInfoScores();
        sb2.displayInfoScores();

        
    }
}

class ScoreBoard {
    
    private String gameName ;
    private int score[] ;

    public ScoreBoard (String gameName , int[] scores) {
        this.gameName = gameName ;
        this.score = scores ;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName ;
        this.score = new int[other.score.length];  
        for (int i = 0; i < other.score.length; i++) {
        this.score[i] = other.score[i];   
    }

    }

    public void displayInfoScores() {
        System.out.println(this.gameName + ":" + "," + this.score[0] + "," + this.score[1] + "," + this.score[2]) ;
    }

}
