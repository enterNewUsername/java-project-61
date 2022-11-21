package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean getCorrectPrimeAnswer(int question) {
        return isPrime(question);
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
    public static void runPrimeGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
           int question = RandomUtils.getRandomNumber();
            questionsAndCorrectAnswers[i][0] = String.valueOf(question);
            questionsAndCorrectAnswers[i][1] = getCorrectPrimeAnswer(question) ? "yes" : "no";
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }
}
