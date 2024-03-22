package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    public void progressionGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < 3) {
            int rnProgres = random.nextInt(0, 50);
            int rnNumb = random.nextInt(0, 50);
            int[] array = new int[10];
            array[0] = rnNumb;
            for (int i = 0; i < array.length - 1; i++) {
                array[i + 1] = array[i] + rnProgres;
            }
            int hiddenNumb = random.nextInt(array.length);
            for (int i = 0; i < array.length; i++) {
                if (i == hiddenNumb) {
                    System.out.print(".." + " ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            String answer = scanner.next();
            int numAnswer = 0;
            if (answer.matches("-?\\d+")) {
                numAnswer = Integer.parseInt(answer);
            }
            if (numAnswer == array[hiddenNumb]) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                String correctAnswer = String.valueOf(array[hiddenNumb]);
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.", answer, correctAnswer);
                System.out.println();
                System.out.println("Let's try again, " + cliName + "!");
                break;
            }

        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + cliName + "!");
        }

    }

}
