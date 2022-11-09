package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calc {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "What is the result of the expression?";
    private static void getCalcQuestion() {
        calcChoice();
    }
    private static String convertCalcQuestionToText() {
        return questionToText;
    }
    private static String getCorrectCalcAnswer() {
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
        String[] arrayOfQuestionsAndCorrectAnswers = new String[RandomUtils.getMaxCountOfQuestionsAndAnswers()];
        int i = 0;
        while (i < arrayOfQuestionsAndCorrectAnswers.length) {
            getCalcQuestion();
            arrayOfQuestionsAndCorrectAnswers[i] = convertCalcQuestionToText();
            arrayOfQuestionsAndCorrectAnswers[i + 1] = getCorrectCalcAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, arrayOfQuestionsAndCorrectAnswers);

    }
}
