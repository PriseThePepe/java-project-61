package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCDGame {
    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER_ONE = 100;
    private static final int BOUND_RANDOM_NUMBER_TWO = 100;

    private static final String MAIN_QUESTION = "Find the greatest common divisor of given numbers.";




    public static  void playGCDGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumbOne = Utils.generateRandomNumberInRange(1, BOUND_RANDOM_NUMBER_ONE);
            int randomNumbTwo = Utils.generateRandomNumberInRange(1, BOUND_RANDOM_NUMBER_TWO);
            questionsAnswerPairs[i][0] = randomNumbOne + " " + randomNumbTwo;
            questionsAnswerPairs[i][1] = String.valueOf(findGCD(randomNumbOne, randomNumbTwo));
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

