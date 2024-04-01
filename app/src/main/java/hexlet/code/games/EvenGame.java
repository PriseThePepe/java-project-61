package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RN_NUMB = 100;
    private static final String MAIN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static  String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void playEvenGame() {
        Random random = new Random();
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int questionNumb = random.nextInt(BOUND_RN_NUMB);
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = String.valueOf(questionNumb);
            questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = isEven(questionNumb) ? "yes" : "no";
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
    private static boolean isEven(int questionNumber) {
        return questionNumber % 2 == 0;
    }
}
