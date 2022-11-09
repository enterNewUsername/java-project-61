package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Gcd {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
    private static void getGcdQuestion() {
        int a = RandomUtils.getRandomNumber() + 1;
        int b = RandomUtils.getRandomNumber() + 1;
        questionToText = a + " " + b;
        question = findGcd(a, b);
    }
    private static String convertGcdQuestionToText() {
        return questionToText;
    }
    private static String getCorrectGcdAnswer() {
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
        String[] gcdQuestionsAndCorrectAnswers = new String[RandomUtils.getMaxCountOfQuestionsAndAnswers()];
        int i = 0;
        while (i < gcdQuestionsAndCorrectAnswers.length) {
            getGcdQuestion();
            gcdQuestionsAndCorrectAnswers[i] = convertGcdQuestionToText();
            gcdQuestionsAndCorrectAnswers[i + 1] = getCorrectGcdAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, gcdQuestionsAndCorrectAnswers);

    }

}

