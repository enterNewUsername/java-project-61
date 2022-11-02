package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Engine {
    private static String userName;

    static void mainEngine(String menuChoice) {
        if (menuChoice.equals("0")) {
            return;
        } else if (menuChoice.equals("1")) {
            getUserNameFromPlayer();
        } else {
            getUserNameFromPlayer();
            int countCorrect = getGoalOfCorrectAnswers();
            askQuestionFromPlayer(menuChoice);

            while (countCorrect >= -1) {
                getQuestionFromGame(menuChoice);
                convertQuestionToText(menuChoice);
                System.out.print("Your answer: ");
                String answer = getAnswerFromPlayer();
                if (runGame(menuChoice, answer)) {
                    System.out.println("Correct!");
                    countCorrect--;
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                    System.out.println(" Correct answer was " + "'" + getCorrectAnswerFromGame(menuChoice) + "'");
                    sayGameOverToPlayer();
                    return;
                }
            }
            sayCongratulationsToPlayer();
        }
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
    private static int getGoalOfCorrectAnswers() {
        return 1;
    }

    private static void askQuestionFromPlayer(@NotNull String menuChoice) {
        switch (menuChoice) {
            case "2":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                System.out.println("What is the result of the expression?");
                break;
            case "4":
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "5":
                System.out.println("What number is missing in the progression?");
                break;
            case "6":
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            case "0":
                return;
            default:
                System.out.println("Incorrect choice!");
    }






}

    private static void getQuestionFromGame(@NotNull String menuChoice) {
        switch (menuChoice) {
            case "2" -> Even.getQuestion();
            case "3" -> Calc.getQuestion();
            case "4" -> Gcd.getQuestion();
            case "5" -> Progression.getQuestion();
            case "6" -> Prime.getQuestion();
            default -> System.out.println("Incorrect choice in getQuestion");
        }

    }

    private static void convertQuestionToText(@NotNull String menuChoice) {
        switch (menuChoice) {
            case "2" -> System.out.println("Question: " + Even.convertQuestionToText());
            case "3" -> System.out.println("Question: " + Calc.convertQuestionToText());
            case "4" -> System.out.println("Question: " + Gcd.convertQuestionToText());
            case "5" -> System.out.println("Question: " + Progression.convertQuestionToText());
            case "6" -> System.out.println("Question: " + Prime.convertQuestionToText());
            default -> System.out.println("Incorrect choice in convertQuestionToText");
        }
    }

    private static boolean runGame(@NotNull String menuChoice, String answer) {
        switch (menuChoice) {
            case "2" -> {
                return Even.checkEven(answer);
            }
            case "3" -> {
                return Calc.checkCalc(answer);
            }
            case "4" -> {
                return Gcd.checkGcd(answer);
            }
            case "5" -> {
                return Progression.checkProgression(answer);
            }
            case "6" -> {
                return Prime.checkPrime(answer);
            }
            default -> System.out.println("Incorrect choice!");
        }
        return false;
    }

    private static String getCorrectAnswerFromGame(@NotNull String menuChoice) {
        switch (menuChoice) {
            case "2" -> {
                return Even.getCorrectAnswer();
            }
            case "3" -> {
                return Calc.getCorrectAnswer();
            }
            case "4" -> {
                return Gcd.getCorrectAnswer();
            }
            case "5" -> {
                return Progression.getCorrectAnswer();
            }
            case "6" -> {
                return Prime.getCorrectAnswer();
            }
            default -> System.out.println("Incorrect choice in getCorrectAnswer");
        }
    return "incorrect choice in getCorrectAnswerFromGame";
}
}
