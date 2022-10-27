package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getCountCorrect;

public class Prime {
    public static void primeGame() {

        Engine.hello();

        System.out.print("Answer 'yes' if given number is prime. ");
        System.out.println("Otherwise answer 'no'.");
        int countCorrect = getCountCorrect();
        while (countCorrect >= -1) {
            Scanner scanner = new Scanner(System.in);
            int question = Engine.getRndNum();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkPrime(question, answer)) {
                countCorrect--;
            } else {
                return;
            }
        }
        Engine.congrats();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int divider = 2;
        while (divider < number / 2) {
            if (number % divider != 0) {
                divider++;
            } else {
                return false;
            }
        }
        return true;
    }
}
