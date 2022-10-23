package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        // Choose range of random numbers
        int from = 1;
        int to = 1000;
        // Count of correct answers
        int countCorrect = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (countCorrect < 3) {
            int question = (int) (from + Math.random() * to);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if ((question % 2 == 0 && answer.equals("yes")) || (question % 2 != 0 && answer.equals("no"))) {
                countCorrect++;
                System.out.println("Correct!");
            } else {
                String correctAnswer = question % 2 == 0 ? "yes" : "no";
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + correctAnswer + "'");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
