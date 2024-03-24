package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    private final int gamesToWin = 3;
    private final int boundRnNum = 100;

    public final void evenGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < gamesToWin) {
            int rnNumb = random.nextInt(boundRnNum);
            if (playRound(cliName, scanner, rnNumb)) {
                correctCount++;
            } else {
                break;
            }
        }
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }

    private boolean playRound(String cliName, Scanner scanner, int rnNumb) {
        System.out.println("Question: " + rnNumb);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if ((rnNumb % 2 == 0 && answer.equals("yes")) || (rnNumb % 2 != 0 && answer.equals("no"))) {
            System.out.println("Correct!");
            return true; // Correct answer
        } else {
            handleIncorrectAnswer(cliName, rnNumb, answer);
            return false; // IncorrectAnswer
        }
    }
    private void handleIncorrectAnswer(String cliName, int rnNumb, String answer) {
        String correctAnswer = (rnNumb % 2 == 0) ? "yes" : "no";
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.%n", answer, correctAnswer);
        System.out.println("Let's try again, " + cliName + "!");
    }
}

