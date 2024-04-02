package hexlet.code;

import java.util.Scanner;


public class Engine {


    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;


    public static void runGame(String mainQuestion, String[][] questionsAnswerPairs) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String cliName = scanner.next();
        System.out.println("Hello, " + cliName + "!");
        System.out.println(mainQuestion);
        for (String[] questionsAnswerPair : questionsAnswerPairs) {
            String correctAnswer = questionsAnswerPair[ANSWER_ROW_NUMBER];
            System.out.println("Question: " + questionsAnswerPair[QUESTION_ROW_NUMBER]);
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
