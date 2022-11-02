package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String menuChoice = mainMenu();
        Engine.mainEngine(menuChoice);
        }




    private static String mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        return scanner.next();
    }
}
