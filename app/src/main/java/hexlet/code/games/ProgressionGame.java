package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.GAMES_TO_WIN;

public class ProgressionGame {
    private static final int BOUND_RANDOM_INCREMENT = 50;
    private static final int BOUND_RANDOM_NUMBER = 50;

    private static final int PROGRESSION_LENGTH = 10;

    private static final String MAIN_QUESTION = "What number is missing in the progression?";

    public static void playProgressionGame() {
        String[][] questionsAnswerPairs = generateQuestionAnswerPairs();
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }

    private static String[][] generateQuestionAnswerPairs() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];

        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int startNumber = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER);
            int step = Utils.generateRandomNumber(BOUND_RANDOM_INCREMENT);
            int length = PROGRESSION_LENGTH;

            String[] progressionArray = generateRandomProgressionArray(startNumber, step, length);
            String[] questionArray = progressionArray.clone();
            int hiddenNumberIndex = Utils.generateRandomNumber(length);
            questionArray[hiddenNumberIndex] = "..";

            questionsAnswerPairs[i][0] = String.join(" ", questionArray);
            questionsAnswerPairs[i][1] = String.valueOf(progressionArray[hiddenNumberIndex]);
        }

        return questionsAnswerPairs;
    }

    private static String[] generateRandomProgressionArray(int startNumber, int step, int length) {
        String[] progressionArray = new String[length];
        int progressionNumber = startNumber;
        for (int j = 0; j < length; j++) {
            progressionArray[j] = String.valueOf(progressionNumber);
            progressionNumber = progressionNumber + step;
        }
        return progressionArray;
    }
}
