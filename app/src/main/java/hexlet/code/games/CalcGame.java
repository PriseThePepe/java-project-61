package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class CalcGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER_ONE = 100;
    private static final int BOUND_RANDOM_NUMBER_TWO = 100;

    private static final String MAIN_QUESTION = "What is the result of the expression?";

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void playCalcGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumbOne = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_ONE);
            int randomNumbTwo = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_TWO);
            char[] operations = {'+', '-', '*'};
            char operation = operations[Utils.generateRandomNumber(operations.length)];

            switch (operation) {
                case '+':
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(randomNumbOne + randomNumbTwo);
                    break;
                case '-':
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(randomNumbOne - randomNumbTwo);
                    break;
                case '*':
                    questionsAnswerPairs[i][ANSWER_ROW_NUMBER] = String.valueOf(randomNumbOne * randomNumbTwo);
                    break;
                default:
                    throw new RuntimeException("Unknown operation: " + operation);


            }
            questionsAnswerPairs[i][QUESTION_ROW_NUMBER] = randomNumbOne + " " + operation + " " + randomNumbTwo;
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
}











