package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAMES_TO_WIN = 3;
    public static void runGame(String mainQuestion, String[][] questionsAnswerPairs) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String cliName = scanner.next();
        System.out.println("Hello, " + cliName + "!");
        System.out.println(mainQuestion);
        for (String[] questionsAnswerPair : questionsAnswerPairs) {
            String correctAnswer = questionsAnswerPair[1];
            System.out.println("Question: " + questionsAnswerPair[0]);
            System.out.print("Your answer: ");
            String cliAnswer = scanner.next();
            boolean isAnswerCorrect = cliAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.%n", cliAnswer, correctAnswer);
                System.out.println("Let's try again, " + cliName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cliName + "!");
    }
}
