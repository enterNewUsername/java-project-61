package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import static hexlet.code.Engine.countCorrect;
import static hexlet.code.Engine.scanner;

public class Calc {
    public static void calcGame() {
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
        int min = 1;
        int maxX = 75;
        int maxY = 15;
        int maxRnd = 3;
        int choice = Engine.getRndNum(min, maxRnd);
        int x = Engine.getRndNum(min, maxX);
        int y = Engine.getRndNum(min, maxY);

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
