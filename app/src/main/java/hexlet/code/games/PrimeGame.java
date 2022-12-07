package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class PrimeGame {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 999;
    private static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeGame() {
        String[][] pairsOfQuestionsAndAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < pairsOfQuestionsAndAnswers.length) {
            int question = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            pairsOfQuestionsAndAnswers[i][0] = String.valueOf(question);
            pairsOfQuestionsAndAnswers[i][1] = isPrime(question) ? "yes" : "no";
            i++;
        }
        Engine.runGame(GAME_QUESTION, pairsOfQuestionsAndAnswers);
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
