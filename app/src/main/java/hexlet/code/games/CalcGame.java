package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class CalcGame {

    private static final int GAMES_TO_WIN = 3;
    private static final int BOUND_RANDOM_NUMBER_ONE = 100;
    private static final int BOUND_RANDOM_NUMBER_TWO = 100;

    private static final String MAIN_QUESTION = "What is the result of the expression?";



    public static void playCalcGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumbOne = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_ONE);
            int randomNumbTwo = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER_TWO);
            char operation = generateRandomOperation();

            int correctAnswer = calculateCorrectAnswer(randomNumbOne, randomNumbTwo, operation);

            questionsAnswerPairs[i][1] = String.valueOf(correctAnswer);

            questionsAnswerPairs[i][0] = randomNumbOne + " " + operation + " " + randomNumbTwo;
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }
    public static char generateRandomOperation() {
        char[] operations = {'+', '-', '*'};
        return operations[Utils.generateRandomNumber(operations.length)];
    }
    public static int calculateCorrectAnswer(int randomNumbOne, int randomNumbTwo, char operation) {
        switch (operation) {
            case '+':
                return randomNumbOne + randomNumbTwo;
            case '-':
                return randomNumbOne - randomNumbTwo;
            case '*':
                return randomNumbOne * randomNumbTwo;
            default:
                throw new RuntimeException("Unknown operation: " + operation);


        }


    }
}











