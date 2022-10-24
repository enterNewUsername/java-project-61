package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;

    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getRndNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
