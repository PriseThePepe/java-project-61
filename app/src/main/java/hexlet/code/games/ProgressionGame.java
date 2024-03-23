package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    private final int gamesToWin = 3;
    private final int boundRnProgression = 50;
    private final int boundRnNum = 50;
    private final int boundRnValues = 10;
    public final void progressionGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < gamesToWin) {
            int[]array = generateProgression(random.nextInt(boundRnNum), random.nextInt(boundRnProgression));
            int hiddenNumb = random.nextInt(array.length);
            displayProgressionWithHiddenNumber(array, hiddenNumb);
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
    public final int[]  generateProgression(int rnNumb, int rnProgression) {
        int[] array = new int[boundRnValues];
        array[0] = rnNumb;
        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] = array[i] + rnProgression;
        }
        return array;
    }
    public final void displayProgressionWithHiddenNumber(int[]array, int hiddenIndex) {
        System.out.print("Question: ");
        for (int i = 0; i < array.length; i++) {
            if (i == hiddenIndex) {
                System.out.print(".." + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

    }

}

