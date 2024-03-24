package hexlet.code;


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
        Scanner choice = new Scanner(System.in);
        int choiceNb = Integer.parseInt(choice.next());

        switch (choiceNb) {
            case (EXIT):
                System.out.println("Bye-bye");
                break;
            case (GREET):
                Cli.greetCli();
                break;
            case (EVEN):
                Engine.playEvenGame();
                break;
            case (CALC):
                Engine.playCalcGame();
                break;
            case (GCD):
                Engine.playGCDGame();
                break;
            case (PROGRESSION):
                Engine.playProgression();
                break;
            case (PRIME):
                Engine.playPrime();
                break;
            default:
                break;
        }
    }
}
