public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        displayHighScorePosition("Bob", calcHighScorePosition(1500));
        displayHighScorePosition("Rob", calcHighScorePosition(900));
        displayHighScorePosition("Bobert", calcHighScorePosition(400));
        displayHighScorePosition("Bobby", calcHighScorePosition(50));


    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your second final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int HighScorePosition){
        System.out.println(playerName + "Managed to get into position " + HighScorePosition+ " on the High Score Table");
    }

    public static int calcHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500){
            return 2;
        }
        else if(playerScore >= 100){
            return 3;
        }
        return 4;
    }
}

