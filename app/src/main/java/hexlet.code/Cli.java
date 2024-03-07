package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void congratCli() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String clientName = scanner.next();
        System.out.println("Hello, " + clientName + "!");
        scanner.close();
    }

}
