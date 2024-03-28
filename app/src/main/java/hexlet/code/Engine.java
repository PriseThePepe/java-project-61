package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;




public class Engine {
    private static final int GAMESTOWIN = 3;

    public static String getCliName() {
        return cliName;
    }

    private static String cliName;

    public static void saluteCli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        cliName = scanner.next();
        System.out.println("Hello, " + cliName + "!");
    }


    public static void playCalcGame() {
        saluteCli();
        System.out.println("What is the result of the expression?");
        CalcGame game = new CalcGame();
        game.calcGame(cliName);

    }
    public static void playEvenGame() {
        saluteCli();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        EvenGame game = new EvenGame();
        game.evenGame(cliName);
    }

    public static void playGCDGame() {
        saluteCli();
        System.out.println("Find the greatest common divisor of given numbers.");
        GCDGame game = new GCDGame();
        game.gcdGame(cliName);
    }
    public static void playProgression() {
        saluteCli();
        System.out.println("What number is missing in the progression?");
        ProgressionGame progression = new ProgressionGame();
        progression.progressionGame(cliName);
    }
    public static void playPrime() {
        saluteCli();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        PrimeGame prime = new PrimeGame();
        prime.primeGame(cliName);
    }


}
