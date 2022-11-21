package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisor {
    static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
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
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int a = RandomUtils.getRandomNumber() + 1;
            int b = RandomUtils.getRandomNumber() + 1;
            questionsAndCorrectAnswers[i][0] = a + " " + b;
            questionsAndCorrectAnswers[i][1] = String.valueOf(findGcd(a, b));
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }

}

