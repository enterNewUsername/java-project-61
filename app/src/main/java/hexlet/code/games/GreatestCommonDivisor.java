package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisor {
    static final int MIN_RANDOM_NUMBER = 1;
    static final int MAX_RANDOM_NUMBER = 125;
    static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
    public static void runGcdGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int a = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int b = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndCorrectAnswers[i][0] = a + " " + b;
            questionsAndCorrectAnswers[i][1] = String.valueOf(findGcd(a, b));
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

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
}

