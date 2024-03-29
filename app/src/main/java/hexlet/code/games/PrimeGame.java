package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;


public class PrimeGame {

    private final int boundRn = 1000;
    public final void primeGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        final int gamesToWin = 3;
        while (correctCount < gamesToWin) {
            if (playRound(random, scanner)) {
                correctCount++;
            } else {
                break;
            }
        }
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }
    public final boolean isPrime(int rnNumb) {
        if (rnNumb < 2) {
            return false;
        }
        for (int i = 2; i * i <= rnNumb; i++) {
            if (rnNumb % i == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean playRound(Random random, Scanner scanner) {
        int rnNumb = random.nextInt(1, boundRn);
        System.out.println("Question: " + rnNumb);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        boolean isPrime = isPrime(rnNumb);
        if (answer.equals("yes") && isPrime || answer.equals("no") && !isPrime) {
            System.out.println("Correct");
            return true; // Correct answer
        } else {
            handleIncorrectAnswer(answer, isPrime);
            return false; // Incorrect answer
        }
    }
    private void handleIncorrectAnswer(String answer, boolean isPrime) {
        String correctAnswer = isPrime ? "yes" : "no";
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + Engine.getCliName() + "!");
    }
}

