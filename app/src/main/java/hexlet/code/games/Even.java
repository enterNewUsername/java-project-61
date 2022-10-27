package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getCountCorrect;

public class Even {
    public static void isEven() {

        Engine.hello();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countCorrect = getCountCorrect();
        while (countCorrect >= -1) {
            Scanner scanner = new Scanner(System.in);
            int question = Engine.getRndNum();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkEven(question, answer)) {
                countCorrect--;
            } else {
                return;
            }
        }
        Engine.congrats();
    }
}
