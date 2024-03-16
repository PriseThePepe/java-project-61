package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public void evenGame(String cliName) {
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < 3) {
            int rnNumb = random.nextInt(1, 100);
            System.out.println("Question: " + rnNumb);
            String answer = scanner.next();
            if (rnNumb % 2 == 0 && answer.equals("yes") || rnNumb % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + (rnNumb % 2 == 0 ? "yes" : "no") + "'.");
                break;
            }
        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }
}
