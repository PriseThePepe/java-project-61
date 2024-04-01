package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;


public class ProgressionGame {
    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RN_PROGRESSION = 50;
    private static final int BOUND_RN_NUMB = 50;
    private static final int BOUND_RN_VALUES = 10;

    private static final String MAIN_QUESTION = "What number is missing in the progression?";
    private static  String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static  void playProgressionGame() {
        Random random = new Random();
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            String[] progressionArray = new String[BOUND_RN_VALUES];
            int hiddenNumb = random.nextInt(progressionArray.length);
            int rnNumb = random.nextInt(BOUND_RN_NUMB);
            int rnNumbProgression = random.nextInt(BOUND_RN_PROGRESSION);
            Arrays.fill(progressionArray, "");
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = "";
            for (int j = 0; j < BOUND_RN_VALUES; j++) {
                if (j != hiddenNumb) {
                    progressionArray[j] = String.valueOf(rnNumb);
                } else {
                    progressionArray[j] = "..";
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(rnNumb);
                }
                rnNumb = rnNumb + rnNumbProgression;
            }
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = String.join(" ", progressionArray);
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
}

