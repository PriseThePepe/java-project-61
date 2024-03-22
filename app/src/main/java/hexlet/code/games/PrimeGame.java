package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {
    public void primeGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < 3) {
            int rnNumb = random.nextInt(1, 1000);
            boolean prime = false;
            System.out.println("Question: " + rnNumb);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (rnNumb < 2) {
                prime = false;
            } else {
                prime = true;
            }
            for (int i = 2; i * i < rnNumb; i++) {
                if (rnNumb % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (answer.equals("yes") && prime || answer.equals("no") && !prime) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                String correctAnswer = prime ? "yes" : "no";
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.", answer, correctAnswer);
                System.out.println();
                System.out.println("Let`s try again, " + cliName);
                break;
            }
            if (correctCount == 3) {
                System.out.println("Congratulations, " + cliName + "!");

            }
        }
    }
}
