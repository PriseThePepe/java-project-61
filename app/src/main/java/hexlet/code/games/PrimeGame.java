package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class PrimeGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER = 1000;

    private static final String MAIN_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void playPrimeGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumb = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER);
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = String.valueOf(randomNumb);
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = isPrime(randomNumb) ? "yes" : "no";
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }


    public static  boolean isPrime(int rnNumb) {
        if (rnNumb < 2) {
            return false;
        }
        for (int i = 2; i * i <= rnNumb; i++) {
            if (rnNumb % i == 0) {
                return false;
            }
        }
        return true;
    }
}



