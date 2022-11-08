package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calc {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "What is the result of the expression?";
    static final int MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS = 6;
    private static void getQuestion() {
        calcChoice();
    }
    private static String convertQuestionToText() {
        return questionToText;
    }
    private static String getCorrectAnswer() {
        return String.valueOf(question);
    }
    private static void calcChoice() {
        String choice = String.valueOf(RandomUtils.getRandomNumber(-1, 1));
       int x = RandomUtils.getRandomNumber();
       int y = RandomUtils.getRandomNumber();

        switch (choice) {
            case "-1" -> {
                questionToText = x + " + " + y;
                question = x + y;
            }
            case "0" -> {
                questionToText = x + " - " + y;
                question = x - y;
            }
            case "1" -> {
                questionToText = x + " * " + y;
                question = x * y;
            }
            default -> {
                System.out.print("Something went wrong with Calc game, sorry!");
            }
        }

    }
    public static void runCalcGame() {
        String[] arrayOfQuestionsAndCorrectAnswers = new String[MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS];
        int i = 0;
        while (i < arrayOfQuestionsAndCorrectAnswers.length) {
            getQuestion();
            arrayOfQuestionsAndCorrectAnswers[i] = convertQuestionToText();
            arrayOfQuestionsAndCorrectAnswers[i + 1] = getCorrectAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, arrayOfQuestionsAndCorrectAnswers);

    }
}
