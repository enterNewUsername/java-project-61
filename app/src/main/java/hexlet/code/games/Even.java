package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        // Count of correct answers
        int countCorrect = 0;
        Scanner scanner = new Scanner(System.in);

        Engine.hello();

        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countCorrect < 3) {
            int question = Engine.getRndNum(10, 200);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkEven(question, answer)) {
                countCorrect++;
            } else {
                return;
            }
        }
        Engine.congrats();
        scanner.close();
    }
}