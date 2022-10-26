package hexlet.code.games;

import static hexlet.code.Engine.scanner;

public class Cli {

    public static void greeting() {
        System.out.println("Hello, World!");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        scanner.close();


    }
}
