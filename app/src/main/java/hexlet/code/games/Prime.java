package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    static final int MIN_RANDOM_NUMBER = 0;
    static final int MAX_RANDOM_NUMBER = 999;
    static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void runPrimeGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int question = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndCorrectAnswers[i][0] = String.valueOf(question);
            questionsAndCorrectAnswers[i][1] = isPrime(question) ? "yes" : "no";
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);
    }
    private static boolean isPrime(int question) {
        if (question < 2) {
            return false;
        }
        int divider = 2;
        while (divider < question / 2) {
            if (question % divider != 0) {
                divider++;
            } else {
                return false;
            }
        }
        return true;
    }
}
