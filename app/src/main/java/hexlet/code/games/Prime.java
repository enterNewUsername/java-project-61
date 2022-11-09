package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    private static int question;
    static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static void getPrimeQuestion() {
        question = RandomUtils.getRandomNumber();
    }
    private static String convertPrimeQuestionToText() {
        return String.valueOf(question);
    }
    private static String getCorrectPrimeAnswer() {
        return isPrime() ? "yes" : "no";
    }
    private static boolean isPrime() {
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
    public static void runPrimeGame() {
        String[] primeQuestionsAndCorrectAnswers = new String[RandomUtils.getMaxCountOfQuestionsAndAnswers()];
        int i = 0;
        while (i < primeQuestionsAndCorrectAnswers.length) {
            getPrimeQuestion();
            primeQuestionsAndCorrectAnswers[i] = convertPrimeQuestionToText();
            primeQuestionsAndCorrectAnswers[i + 1] = getCorrectPrimeAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, primeQuestionsAndCorrectAnswers);

    }
}
