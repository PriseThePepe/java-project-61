package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.GAMES_TO_WIN;

public class EvenGame {
    private static final int BOUND_RANDOM_NUMBER = 100;
    private static final String MAIN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEvenGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumber = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER);
            questionsAnswerPairs[i][0] = String.valueOf(randomNumber);
            questionsAnswerPairs[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
