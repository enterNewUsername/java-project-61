package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Gcd {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
    static final int MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS = 6;
    private static void getQuestion() {
        int a = RandomUtils.getRandomNumber() + 1;
        int b = RandomUtils.getRandomNumber() + 1;
        questionToText = a + " " + b;
        question = findGcd(a, b);
    }
    private static String convertQuestionToText() {
        return questionToText;
    }
    private static String getCorrectAnswer() {
        return String.valueOf(question);
    }
    private static int findGcd(int a, int b) {
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
    public static void runGcdGame() {
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

