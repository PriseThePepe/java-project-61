package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class CalcGame {

    private final int gamesToWin = 3;
    private final int boundRnNumOne = 100;
    private final int boundRnNumTwo = 100;

    public final void calcGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < gamesToWin) {
            int rnNumbOne = random.nextInt(boundRnNumOne);
            int rnNumbTwo = random.nextInt(boundRnNumTwo);
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];
            if (playRound(cliName, scanner, rnNumbOne, rnNumbTwo, operation)) {
                correctCount++;
            } else {
                break;
            }
        }
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }
    public final String calcResult(int rnNumbOne, int rnNumbTwo, char operation, String cliAnswer) {
        switch (operation) {
            case '+':
                return String.valueOf(rnNumbOne + rnNumbTwo);
            case '-':
                return String.valueOf(rnNumbOne - rnNumbTwo);
            case '*':
                return  String.valueOf(rnNumbOne * rnNumbTwo);
            default:
                return cliAnswer;
        }
    }
    private boolean playRound(String cliName, Scanner scanner, int rnNumbOne, int rnNumbTwo, char operation) {
        System.out.println("Question: " + rnNumbOne + " " + operation + " " + rnNumbTwo);
        System.out.print("Your answer: ");
        String cliAnswer = scanner.next();
        String correctAnswer = calcResult(rnNumbOne, rnNumbTwo, operation, cliAnswer);
        if (cliAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            handleIncorrectAnswer(cliName, cliAnswer, correctAnswer);
            return false;
        }
    }
    private void handleIncorrectAnswer(String cliName, String cliAnswer, String correctAnswer) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.%n", cliAnswer, correctAnswer);
        System.out.println("Let's try again, " + cliName + "!");
    }
}






