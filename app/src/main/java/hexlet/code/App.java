package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        String menuChoice = Engine.mainMenu();
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
            case "4":
                Gcd.gcdGame();
                break;
            case "5":
                Progression.progressionGame();
                break;
            case "6":
                Prime.primeGame();
                break;
            case "0":
                break;
            default:
                System.out.println("Incorrect choice!");
        }


    }
}
