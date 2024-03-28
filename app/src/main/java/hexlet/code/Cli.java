package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetCli() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String cliName = scanner.next();
        System.out.println("Hello, " + cliName + "!");
    }
}

