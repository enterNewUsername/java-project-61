package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    //Count of correct answers
    public static int countCorrect;
    public static Scanner scanner = new Scanner(System.in);

    public static String mainMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        return scanner.next();
    }

    public static void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + userName + "!");
        countCorrect = 0;
    }

    public static void gameOver() {
        System.out.println("Let's try again, " + userName + "!");
        countCorrect = 0;
    }

    public static int getRndNum(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }


}
