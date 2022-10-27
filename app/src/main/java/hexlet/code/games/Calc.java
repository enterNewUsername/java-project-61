package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getCountCorrect;

public class Calc {
    public static void calcGame() {
        Engine.hello();

        System.out.println("What is the result of the expression?");
        int countCorrect = getCountCorrect();
        while (countCorrect >= -1) {
            Scanner scanner = new Scanner(System.in);
            calcChoice();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkCalc(result, answer)) {
                countCorrect--;
            } else {
                return;
            }
        }
        Engine.congrats();
    }
    private static int result = 0;
    private static String question = "";
    public static void calcChoice() {
        String choice = String.valueOf(Engine.getRndNum(-1, 1));
       int x = Engine.getRndNum();
       int y = Engine.getRndNum();

        switch (choice) {
            case "-1" -> {
                question = x + " + " + y;
                result = x + y;
            }
            case "0" -> {
                question = x + " - " + y;
                result = x - y;
            }
            case "1" -> {
                question = x + " * " + y;
                result = x * y;
            }
            default -> {
                System.out.print("Something went wrong with this game, sorry!");
            }
        }

    }
}
