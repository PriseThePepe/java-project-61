package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.GAMES_TO_WIN;

public class PrimeGame {
    private static final int BOUND_RANDOM_NUMBER = 1000;
    private static final String MAIN_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrimeGame() {
        String[][] questionsAnswerPairs = new String[GAMES_TO_WIN][2];
        for (int i = 0; i < GAMES_TO_WIN; i++) {
            int randomNumber = Utils.generateRandomNumber(BOUND_RANDOM_NUMBER);
            questionsAnswerPairs[i][0] = String.valueOf(randomNumber);
            questionsAnswerPairs[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(MAIN_QUESTION, questionsAnswerPairs);
    }

    public static  boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



