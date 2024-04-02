package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCDGame {
    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER_ONE = 100;
    private static final int BOUND_RANDOM_NUMBER_TWO = 100;

    private static final String MAIN_QUESTION = "Find the greatest common divisor of given numbers.";

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;


    public static  void playGCDGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumbOne = Utils.generateRandomNumberInRange(1, BOUND_RANDOM_NUMBER_ONE);
            int randomNumbTwo = Utils.generateRandomNumberInRange(1, BOUND_RANDOM_NUMBER_TWO);
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = randomNumbOne + " " + randomNumbTwo;
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(findGCD(randomNumbOne, randomNumbTwo));
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }

    public static int findGCD(int randomNumberOne, int randomNumberTwo) {
        while (randomNumberOne != 0 && randomNumberTwo != 0) {
            if (randomNumberOne > randomNumberTwo) {
                randomNumberOne = randomNumberOne % randomNumberTwo;
            } else {
                randomNumberTwo = randomNumberTwo % randomNumberOne;
            }
        }
        return randomNumberOne + randomNumberTwo;
    }
}

