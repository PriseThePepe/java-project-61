package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class CalcGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RN_NUM_ONE = 100;
    private static final int BOUND_RN_NUM_TWO = 100;

    private static final String MAIN_QUESTION = "What is the result of the expression?";
    private static  String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void playCalcGame() {
        Random random = new Random();
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int rnNumbOne = random.nextInt(BOUND_RN_NUM_ONE);
            int rnNumbTwo = random.nextInt(BOUND_RN_NUM_TWO);
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            switch (operation) {
                case '+':
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(rnNumbOne + rnNumbTwo);
                    break;
                case '-':
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(rnNumbOne - rnNumbTwo);
                    break;
                default:
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(rnNumbOne * rnNumbTwo);
                    break;
            }
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = rnNumbOne + " " + operation + " " + rnNumbTwo;
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
}











