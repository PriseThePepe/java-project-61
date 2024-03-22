package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    public final void progressionGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int gamesToWin = 3;
        int correctCount = 0;
        int boundRnProgression=50;
        int boundRnNum=50;
        while (correctCount < gamesToWin) {
            int rnProgression = random.nextInt(0, boundRnProgression);
            int rnNumb = random.nextInt(0, boundRnNum);
            int[] array = new int[10];
            array[0] = rnNumb;
            for (int i = 0; i < array.length - 1; i++) {
                array[i + 1] = array[i] + rnProgression;
            }
            int hiddenNumb = random.nextInt(array.length);
            System.out.print("Question: ");
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
        if (correctCount == gamesToWin) {
            System.out.println("Congratulations, " + cliName + "!");
        }

    }

}
