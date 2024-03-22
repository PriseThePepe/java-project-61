package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class CalcGame {

    public final void calcGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        final int gamesToWin = 3;

        final int boundRnOp = 100;
        final int boundRnNumOne = 20;
        final int originRnNumOne = 10;
        final int boundRnNumTwo = 10;

        final int percentageBoundMinus = 33;
        final int percentageBoundMul = 67;
        final int percentageOriginPlus = 34;

        while (correctCount < gamesToWin) {
            int rnOperation = random.nextInt(0, boundRnOp);
            int rnNumbOne = random.nextInt(originRnNumOne, boundRnNumOne);
            int rnNumbTwo = random.nextInt(0, boundRnNumTwo);
            if (rnOperation >= 0 && rnOperation <= percentageBoundMinus) {
                System.out.println("Question: " + rnNumbOne + " - " + rnNumbTwo);
                System.out.print("Your answer: ");
                String answer = scanner.next();
                int numAnswer = 0;
                if (answer.matches("-?\\d+")) {
                    numAnswer = Integer.parseInt(answer);
                }
                if (rnNumbOne - rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    int correctAns = rnNumbOne - rnNumbTwo;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAns + "`");
                    System.out.println("Let's try again, " + cliName + "!");
                    break;
                }
            }
            if (rnOperation > percentageBoundMul) {
                System.out.println("Question: " + rnNumbOne + " * " + rnNumbTwo);
                System.out.print("Your answer: ");
                String answer = scanner.next();
                int numAnswer = 0;
                if (answer.matches("-?\\d+")) {
                    numAnswer = Integer.parseInt(answer);
                }
                if (rnNumbOne * rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    int correctAns = rnNumbOne * rnNumbTwo;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAns + "`");
                    System.out.println("Let's try again, " + cliName + "!");
                    break;
                }
            }
            if (rnOperation >= percentageOriginPlus && rnOperation <= percentageBoundMul) {
                System.out.println("Question: " + rnNumbOne + " + " + rnNumbTwo);
                System.out.print("Your answer: ");
                String answer = scanner.next();
                int numAnswer = 0;
                if (answer.matches("-?\\d+")) {
                    numAnswer = Integer.parseInt(answer);
                }
                if (rnNumbOne + rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    int correctAns = rnNumbOne + rnNumbTwo;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAns + "`");
                    System.out.println("Let's try again, " + cliName + "!");
                    break;
                }

            }
            if (correctCount == gamesToWin) {
                System.out.println("Congratulations, " + cliName + "!");
            }

        }
    }
}




