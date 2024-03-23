package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {
    public final void primeGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        final int gamesToWin = 3;
        final int boundRn = 1000;

        while (correctCount < gamesToWin) {
            int rnNumb = random.nextInt(1, boundRn);
            System.out.println("Question: " + rnNumb);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            boolean isPrime = isPrime(rnNumb);

            if (answer.equals("yes") && isPrime || answer.equals("no") && !isPrime) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                String correctAnswer  = isPrime ? "yes" : "no";
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.", answer, correctAnswer);
                System.out.println();
                System.out.println("Let's try again, " + cliName + "!");
                break;
            }
            if (correctCount == gamesToWin) {
                System.out.println("Congratulations, " + cliName + "!");

            }
        }
    }

    public boolean isPrime(int rnNumb) {
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
}

