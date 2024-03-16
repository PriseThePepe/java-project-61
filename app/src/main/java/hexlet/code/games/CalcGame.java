package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class CalcGame {
    public void calcGame(String cliName) {
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int correctCount = 0;
        while (correctCount < 3) {
            int rnOperation = random.nextInt(0, 100);
            int rnNumbOne = random.nextInt(10, 20);
            int rnNumbTwo = random.nextInt(0, 10);
            if (rnOperation >= 0 && rnOperation <= 33) {
                System.out.println("Question: " + rnNumbOne + "-" + rnNumbTwo);
                String answer =scanner.next();
                int numAnswer = 0;
                if(answer.matches("-?\\d+")){
                  numAnswer=Integer.parseInt(answer);
                }
                if (rnNumbOne - rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + (rnNumbOne - rnNumbTwo) +"`");
                    System.out.println("Let`s try again, "+ cliName);
                    break;
                }
            }
            if (rnOperation > 67) {
                System.out.println("Question: " + rnNumbOne + "*" + rnNumbTwo);
                String answer =scanner.next();
                int numAnswer = 0;
                if(answer.matches("-?\\d+")){
                    numAnswer=Integer.parseInt(answer);
                }
                if (rnNumbOne * rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + (rnNumbOne * rnNumbTwo)+"`");
                    System.out.println("Let`s try again "+ cliName);
                    break;
                }
            }
            if (rnOperation >= 34 && rnOperation <= 67) {
                System.out.println("Question: " + rnNumbOne + "+" + rnNumbTwo);
                String answer =scanner.next();
                int numAnswer = 0;
                if(answer.matches("-?\\d+")){
                    numAnswer=Integer.parseInt(answer);
                }
                if (rnNumbOne + rnNumbTwo == numAnswer) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + (rnNumbOne + rnNumbTwo)+"`");
                    System.out.println("Let`s try again "+ cliName);
                    break;
                }

            }

        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + cliName + "!");
        }
    }
}