package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import static hexlet.code.Engine.countCorrect;
import static hexlet.code.Engine.scanner;

public class Prime {
    public static void primeGame() {

        Engine.hello();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (countCorrect < 3) {
            int question = Engine.getRndNum(10, 200);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkPrime(question, answer)) {
                countCorrect++;
            } else {
                return;
            }
        }
        Engine.congrats();
        scanner.close();
    }

    public static boolean isPrime(int number) {
        int divider = number;
        while (divider > 0) {
            if (number % divider == 0) {
                divider--;
            } else {
                return false;
            }
        }
        return true;
    }
}
