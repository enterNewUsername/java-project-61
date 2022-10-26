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

    public static void gameOver() {
        System.out.println("Let's try again, " + userName + "!");
    }

    public static int getRndNum(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }


}
