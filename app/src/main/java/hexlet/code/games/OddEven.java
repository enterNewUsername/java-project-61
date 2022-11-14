package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class OddEven {
    static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String getCorrectEvenAnswer(int question) {
        return question % 2 == 0 ? "yes" : "no";
    }
    public static void runEvenGame() {
        String[][] questionsAndCorrectAnswers = new String[RandomUtils.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int question = RandomUtils.getRandomNumber();
            questionsAndCorrectAnswers[i][0] = String.valueOf(question);
            questionsAndCorrectAnswers[i][1] = getCorrectEvenAnswer(question);
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }

}
