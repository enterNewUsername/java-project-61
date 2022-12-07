package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class OddEvenGame {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 999;
    private static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenGame() {
        String[][] pairsOfQuestionsAndAnswers = new String[Engine.getCountOfQuestions()][2];
        for (int i = 0; i < pairsOfQuestionsAndAnswers.length; i++) {
            int question = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            pairsOfQuestionsAndAnswers[i][0] = String.valueOf(question);
            pairsOfQuestionsAndAnswers[i][1] = isEven(question) ? "yes" : "no";
        }
        Engine.runGame(GAME_QUESTION, pairsOfQuestionsAndAnswers);
    }

    private static boolean isEven(int question) {
        return question % 2 == 0;
    }
}
