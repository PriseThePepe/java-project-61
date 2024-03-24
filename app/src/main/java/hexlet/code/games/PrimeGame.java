package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {
    public final void primeGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        final int gamesToWin = 3;

        while (correctCount < gamesToWin) {
            playRound(random, scanner);
            correctCount++;
        }
        System.out.println("Congratulations, " + cliName + "!");
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

    public final void playRound(Random random, Scanner scanner) {
        final int boundRn = 1000;
        int rnNumb = random.nextInt(1, boundRn);
        System.out.println("Question: " + rnNumb);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        boolean isPrime = isPrime(rnNumb);
        checkAnswer(answer, isPrime);
    }

    public final void checkAnswer(String answer, boolean isPrime) {
        if (answer.equalsIgnoreCase("yes") == isPrime) {
            System.out.println("Correct!");
        } else {
            String correctAnswer = isPrime ? "yes" : "no";
            System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
            System.out.println("Let's try again, " + Engine.cliName + "!");
            System.exit(0);
        }
    }
}

