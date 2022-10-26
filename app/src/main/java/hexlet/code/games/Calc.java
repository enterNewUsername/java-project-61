package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        int countCorrect = 0;
        Scanner scanner = new Scanner(System.in);

        Engine.hello();

        System.out.println("What is the result of the expression?");
        while (countCorrect < 3) {
            calcChoice();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkCalc(result, answer)) {
                countCorrect++;
            } else {
                return;
            }
        }
        Engine.congrats();
        scanner.close();
    }
    public static int result = 0;
    public static String question = "";
    public static void calcChoice() {
        int choice = Engine.getRndNum(1, 3);
        int x = Engine.getRndNum(1, 75);
        int y = Engine.getRndNum(1, 15);

        switch (choice) {
            case 1 -> {
                question = x + " + " + y;
                result = x + y;
            }
            case 2 -> {
                question = x + " - " + y;
                result = x - y;
            }
            case 3 -> {
                question = x + " * " + y;
                result = x * y;
            }
            default -> {
                System.out.print("Something went wrong with this game, sorry!");
            }
        }

    }
}
