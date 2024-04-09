package hexlet.code;

import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case (EXIT):
                    System.out.println("Bye-bye");
                    break;
                case (GREET):
                    Cli.greetCli();
                    break;
                case (EVEN):
                    EvenGame.playEvenGame();
                    break;
                case (CALC):
                    CalcGame.playCalcGame();
                    break;
                case (GCD):
                    GCDGame.playGCDGame();
                    break;
                case (PROGRESSION):
                    ProgressionGame.playProgressionGame();
                    break;
                case (PRIME):
                    PrimeGame.playPrimeGame();
                    break;
                default:
                    System.err.println("Error: Invalid choice "
                                        +
                                        choiceNumber
                                        +
                                        " Please enter a number between 0 and 6");
                    break;
            }
        } else {
            System.err.println("Error: Invalid choice. Please enter a number between 0 and 6");
        }
        scanner.close();
    }
}
