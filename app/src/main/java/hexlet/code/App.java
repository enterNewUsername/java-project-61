package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.OddEven;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    static final String HEADER = "Please enter the game number and press Enter.";
    static final String MENU = """
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit
            Your choice:\s""";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(HEADER);
        System.out.print(MENU);
        String answer = scanner.next();
        switch (answer) {
            case "1" -> Cli.greeting();
            case "2" -> OddEven.runEvenGame();
            case "3" -> Calculator.runCalcGame();
            case "4" -> GreatestCommonDivisor.runGcdGame();
            case "5" -> Progression.runProgressionGame();
            case "6" -> Prime.runPrimeGame();
            default -> System.out.println("Incorrect choice!");
        }
        }
}
