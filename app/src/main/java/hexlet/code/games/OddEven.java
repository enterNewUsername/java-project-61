package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class OddEven {
    static final int MIN_RANDOM_NUMBER = 0;
    static final int MAX_RANDOM_NUMBER = 999;
    static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void runEvenGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int question = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndCorrectAnswers[i][0] = String.valueOf(question);
            questionsAndCorrectAnswers[i][1] = isEven(question) ? "yes" : "no";
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);
    }
    private static boolean isEven(int question) {
        return question % 2 == 0;
    }
}
