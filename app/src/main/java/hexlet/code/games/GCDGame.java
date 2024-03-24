package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    private final int gamesToWin = 3;
    private final int boundRnNumOne = 100;
    private final int boundRnNumTwo = 100;

    public final void gcdGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < gamesToWin) {
            int rnNumbOne = random.nextInt(1, boundRnNumOne);
            int rnNumbTwo = random.nextInt(1, boundRnNumTwo);
            int gcd = findGCD(rnNumbOne, rnNumbTwo);
            if (playRound(cliName, scanner, rnNumbOne, rnNumbTwo, gcd)) {
                correctCount++;
            } else {
                break;
            }

        }
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }

    public final int findGCD(int rnNumberOne, int rnNumberTwo) {
        while (rnNumberOne != 0 && rnNumberTwo != 0) {
            if (rnNumberOne > rnNumberTwo) {
                rnNumberOne = rnNumberOne % rnNumberTwo;
            } else {
                rnNumberTwo = rnNumberTwo % rnNumberOne;
            }
        }
        return rnNumberOne + rnNumberTwo;
    }
    private boolean playRound(String cliName, Scanner scanner, int rnNumbOne, int rnNumbTwo, int gcd) {
        System.out.println("Question: " + rnNumbOne + " " + rnNumbTwo);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        int numAnswer = 0;
        if (answer.matches("-?\\d+")) {
            numAnswer = Integer.parseInt(answer);
        }
        if (numAnswer == gcd) {
            System.out.println("Correct!");
            return true; // Correct answer
        } else {
            handleIncorrectAnswer(cliName, answer, gcd);
            return false; // Incorrect answer
        }
    }

    private void handleIncorrectAnswer(String cliName, String answer, int gcd) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "`");
        System.out.println("Let's try again, " + cliName + "!");
    }
}
