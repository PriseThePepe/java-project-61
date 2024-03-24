package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static int correctCount = 0;

    public static int rnNumb = 0;
    public static String answer;

    public final void evenGame(String cliName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int boundRnNum = 100;
        rnNumb = random.nextInt(1, boundRnNum);
        System.out.println("Question: " + rnNumb);
        System.out.print("Your answer: ");
        answer = scanner.next();

    }
}
