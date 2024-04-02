package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class EvenGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER = 100;
    private static final String MAIN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void playEvenGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumb = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER);
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = String.valueOf(randomNumb);
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = isEven(randomNumb) ? "yes" : "no";
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
    private static boolean isEven(int questionNumber) {
        return questionNumber % 2 == 0;
    }
}
