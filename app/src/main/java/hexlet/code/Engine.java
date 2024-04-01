package hexlet.code;

import java.util.Scanner;


public class Engine {

    private static String cliName;

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;


    public static String getCliName() {
        return cliName;
    }



    public static void saluteCli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        cliName = scanner.next();
        System.out.println("Hello, " + cliName + "!");
    }
    public static void runGame(String mainQuestion, String[][] questionsAnswerPairs) {
        saluteCli();
        System.out.println(mainQuestion);
        for (int i = 0; i < questionsAnswerPairs.length; i++) {
            Scanner scanner = new Scanner(System.in);
            String correctAnswer = questionsAnswerPairs[i][ANSWER_ROW_NUMBER];
            System.out.println("Question: " + questionsAnswerPairs[i][QUESTION_ROW_NUMBER]);
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
