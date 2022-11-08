package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    public static void mainEngine(String gameQuestion, String[] arrayOfQuestionsAndCorrectAnswers) {
            getUserNameFromPlayer();
        System.out.println(gameQuestion);
        int i = 0;
            while (i < arrayOfQuestionsAndCorrectAnswers.length) {
                System.out.println("Question: " + arrayOfQuestionsAndCorrectAnswers[i]);
                System.out.print("Your answer: ");
                String answer = getAnswerFromPlayer();
                if (answer.equals(arrayOfQuestionsAndCorrectAnswers[i + 1])) {
                    System.out.println("Correct!");
                    i = i + 2;
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                    System.out.println(" Correct answer was " + "'" + arrayOfQuestionsAndCorrectAnswers[i + 1] + "'");
                    sayGameOverToPlayer();
                    return;
                }
            }
            sayCongratulationsToPlayer();
        }
    private static String getAnswerFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    private static void getUserNameFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    private static void sayCongratulationsToPlayer() {
        System.out.println("Congratulations, " + userName + "!");
    }
    private static void sayGameOverToPlayer() {
        System.out.println("Let's try again, " + userName + "!");
    }

}
