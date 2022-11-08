package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void mainEngine(String gameQuestion, String[] arrayOfQuestionsAndCorrectAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameQuestion);
        int i = 0;
            while (i < arrayOfQuestionsAndCorrectAnswers.length) {
                System.out.println("Question: " + arrayOfQuestionsAndCorrectAnswers[i]);
                System.out.print("Your answer: ");
                String answer = scanner.next();
                if (answer.equals(arrayOfQuestionsAndCorrectAnswers[i + 1])) {
                    System.out.println("Correct!");
                    i = i + 2;
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                    System.out.println(" Correct answer was " + "'" + arrayOfQuestionsAndCorrectAnswers[i + 1] + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            }
        System.out.println("Congratulations, " + userName + "!");
        }

}
