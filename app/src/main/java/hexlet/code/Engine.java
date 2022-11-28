package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final String GREETING_STR = "Welcome to the Brain Games!\nMay I have your name?";
    static final String ANSWER_STR = "Your answer: ";
    static final String CORRECT_STR = "Correct!";
    static final int COUNT_OF_QUESTIONS = 3;

    public static void runGame(String gameQuestion, String[][] arrayOfQuestionsAndCorrectAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GREETING_STR);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameQuestion);
        int i = 0;
            while (i < arrayOfQuestionsAndCorrectAnswers.length) {
                System.out.println("Question: " + arrayOfQuestionsAndCorrectAnswers[i][0]);
                System.out.print(ANSWER_STR);
                String answer = scanner.next();
                if (answer.equals(arrayOfQuestionsAndCorrectAnswers[i][1])) {
                    System.out.println(CORRECT_STR);
                    i++;
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                    System.out.println(" Correct answer was " + "'" + arrayOfQuestionsAndCorrectAnswers[i][1] + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            }
        System.out.println("Congratulations, " + userName + "!");
        }
    public static int getCountOfQuestions() {
        return COUNT_OF_QUESTIONS;
    }
}
