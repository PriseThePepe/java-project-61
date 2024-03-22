package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    public final void gcdGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        final int gamesToWin = 3;

        final int boundRnNumOne = 100;
        final int boundRnNumTwo = 100;
        while (correctCount < gamesToWin) {
            int rnNumbOne = random.nextInt(1, boundRnNumOne);
            int rnNumbTwo = random.nextInt(1, boundRnNumTwo);
            int max;
            System.out.println("Question: " + rnNumbOne + " " + rnNumbTwo);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            int numAnswer = 0;
            if (answer.matches("-?\\d+")) {
                numAnswer = Integer.parseInt(answer);
            }
            while (rnNumbOne != 0 && rnNumbTwo != 0) {
                if (rnNumbOne > rnNumbTwo) {
                    rnNumbOne = rnNumbOne % rnNumbTwo;
                } else {
                    rnNumbTwo = rnNumbTwo % rnNumbOne;
                }
            } max = rnNumbOne + rnNumbTwo;
            if (numAnswer == max) {
                correctCount++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + max + "`");
                System.out.println("Let's try again, " + cliName + "!");
                break;
            }

        }
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }

    }
}
