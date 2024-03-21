package hexlet.code;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
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
            case (0):
                System.out.println("Bye-bye");
                break;
            case (1):
                Cli.greetCli();
                break;
            case (2):
                Engine.playEvenGame();
                break;
            case (3):
                Engine.playCalcGame();
                break;
            case(4):
                Engine.playGCDGame();
                break;
            case(5):
                Engine.playProgression();
                break;
            case(6):
                Engine.playPrime();
                break;
            default:  break;



        }
    }
}
