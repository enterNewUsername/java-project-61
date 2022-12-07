package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.OddEvenGame;
import hexlet.code.games.GreatestCommonDivisorGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    private static final String HEADER = "Please enter the game number and press Enter.";
    private static final String MENU = """
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
            case "2" -> OddEvenGame.runEvenGame();
            case "3" -> CalculatorGame.runCalcGame();
            case "4" -> GreatestCommonDivisorGame.runGcdGame();
            case "5" -> ProgressionGame.runProgressionGame();
            case "6" -> PrimeGame.runPrimeGame();
            default -> System.out.println("Incorrect choice!");
        }
    }
}
