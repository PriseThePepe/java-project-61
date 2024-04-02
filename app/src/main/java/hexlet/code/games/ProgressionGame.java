package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class ProgressionGame {
    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_INCREMENT = 50;
    private static final int BOUND_RANDOM_NUMBER = 50;

    private static final int PROGRESSION_LENGTH = 10;

    private static final String MAIN_QUESTION = "What number is missing in the progression?";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

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
            int hiddenNumberIndex = Utils.generateRandomNumber(length);

            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = formatQuestion(progressionArray, hiddenNumberIndex);
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(progressionArray[hiddenNumberIndex]);
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
    private static String formatQuestion(String[] progressionArray, int hiddenNumberIndex) {
        String[] questionArray = progressionArray.clone();
        questionArray[hiddenNumberIndex] = "..";
        return String.join(" ", questionArray);
    }
}
