package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCDGame {
    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RN_NUM_ONE = 100;
    private static final int BOUND_RN_NUM_TWO = 100;

    private static final String MAIN_QUESTION = "Find the greatest common divisor of given numbers.";
    private static  String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;


    public static  void playGCDGame() {
        Random random = new Random();
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int rnNumbOne = random.nextInt(1, BOUND_RN_NUM_ONE);
            int rnNumbTwo = random.nextInt(1, BOUND_RN_NUM_TWO);
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = rnNumbOne + " " + rnNumbTwo;
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(findGCD(rnNumbOne, rnNumbTwo));
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }

    public static int findGCD(int rnNumberOne, int rnNumberTwo) {
        while (rnNumberOne != 0 && rnNumberTwo != 0) {
            if (rnNumberOne > rnNumberTwo) {
                rnNumberOne = rnNumberOne % rnNumberTwo;
            } else {
                rnNumberTwo = rnNumberTwo % rnNumberOne;
            }
        }
        return rnNumberOne + rnNumberTwo;
    }
}

