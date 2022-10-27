package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getCountCorrect;

public class Gcd {
    public static void gcdGame() {

        Engine.hello();

        System.out.println("Find the greatest common divisor of given numbers.");
        int countCorrect = getCountCorrect();
        while (countCorrect >= -1) {
            Scanner scanner = new Scanner(System.in);
            int a = Engine.getRndNum() + 1;
            int b = Engine.getRndNum() + 1;
            System.out.println("Question: " + a + " " + b);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkGcd(a, b, answer)) {
                countCorrect--;
            } else {
                return;
            }
        }
        Engine.congrats();
    }

    public static int findGcd(int a, int b) {
        int temp = 0;
        if (b > a) {
            temp = b;
            b = a;
            a = temp;
        }
        while (a % b != 0) {
            if (a % b == 0) {
                return b;
            } else {
                temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }
}

