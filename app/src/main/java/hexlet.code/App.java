package hexlet.code;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        final int exit = 0;

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
            case (exit):
                System.out.println("Bye-bye");
                break;
            case (greet):
                Cli.greetCli();
                break;
            case (even):
                Engine.playEvenGame();
                break;
            case (calc):
                Engine.playCalcGame();
                break;
            case (gcd):
                Engine.playGCDGame();
                break;
            case (progression):
                Engine.playProgression();
                break;
            case (prime):
                Engine.playPrime();
                break;
            default:  break;



        }
    }
}
