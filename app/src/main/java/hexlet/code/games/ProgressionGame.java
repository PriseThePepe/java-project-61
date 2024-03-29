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
            if (playRound(cliName, scanner, array, hiddenNumb)) {
                correctCount++;
            } else {
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
    private boolean playRound(String cliName, Scanner scanner, int[]array, int hiddenNumb) {
        System.out.print("Your answer: ");
        String cliAnswer = scanner.next();
        int numAnswer = 0;
        if (cliAnswer.matches("-?\\d+")) {
            numAnswer = Integer.parseInt(cliAnswer);
        }
        if (numAnswer == array[hiddenNumb]) {
            System.out.println("Correct!");
            return true; // Correct answer
        } else {
            handleIncorrectAnswer(cliName, cliAnswer, array, hiddenNumb);
            return false; // Incorrect answer
        }
    }

    private void handleIncorrectAnswer(String cliName, String cliAnswer, int[]array, int hiddenNumb) {
        String correctAnswer = String.valueOf(array[hiddenNumb]);
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.", cliAnswer, correctAnswer);
        System.out.println();
        System.out.println("Let's try again, " + cliName + "!");
    }

}

