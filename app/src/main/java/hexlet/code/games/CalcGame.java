package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class CalcGame {

    public final void calcGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        final int gamesToWin = 3;
        final int boundRnNumOne = 100;
        final int boundRnNumTwo = 100;

        while (correctCount < gamesToWin) {
            int rnNumbOne = random.nextInt(boundRnNumOne);
            int rnNumbTwo = random.nextInt(boundRnNumTwo);
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            System.out.println("Question: " + rnNumbOne + " " + operation + " " + rnNumbTwo);
            System.out.print("Your answer: ");
            String cliAnswer = scanner.next();
            String correctAnswer = calcResult(rnNumbOne, rnNumbTwo, operation, cliAnswer);

            if (cliAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                handleIncorrectAnswer(cliName, cliAnswer, correctAnswer);
                break;
            }
            if (correctCount == gamesToWin) {
                System.out.println("Congratulations, " + cliName + "!");
            }


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
    private void handleIncorrectAnswer(String cliName, String cliAnswer, String correctAnswer) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.%n", cliAnswer, correctAnswer);
        System.out.println("Let's try again, " + cliName + "!");
    }
}






