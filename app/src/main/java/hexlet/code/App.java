package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Evenn\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        String menuChoice = scanner.next();

        switch (menuChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.isEven();
                break;
            case "3":
                Calc.calcGame();
                break;
            case "0":
                break;
            default:
                System.out.println("Incorrect choice!");
        }


    }
}
