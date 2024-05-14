package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.GAMES_TO_WIN;

public class CalcGame {
    private static final int BOUND_RANDOM_NUMBER_ONE = 100;
    private static final int BOUND_RANDOM_NUMBER_TWO = 100;

    private static final String MAIN_QUESTION = "What is the result of the expression?";

    public static void playCalcGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumberOne = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_ONE);
            int randomNumberTwo = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_TWO);

            char[] operations = {'+', '-', '*'};
            int indexOperation = Utils.generateRandomNumberInRange(0,operations.length-1);
            char operation = operations[indexOperation];

            int correctAnswer = calculateCorrectAnswer(randomNumberOne, randomNumberTwo, operation);

            questionsAnswerPairs[i][1] = String.valueOf(correctAnswer);

            questionsAnswerPairs[i][0] = randomNumberOne + " " + operation + " " + randomNumberTwo;
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }

    public static int calculateCorrectAnswer(int numberOne, int numberTwo, char operation) {
        switch (operation) {
            case '+':
                return numberOne + numberTwo;
            case '-':
                return numberOne - numberTwo;
            case '*':
                return numberOne * numberTwo;
            default:
                throw new RuntimeException("Unknown operation: " + operation);


        }
    }
}











