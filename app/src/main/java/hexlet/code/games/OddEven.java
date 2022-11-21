package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class OddEven {
    static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static boolean getCorrectEvenAnswer(int question) {
        return question % 2 == 0;
    }
    public static void runEvenGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];

       for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int question = RandomUtils.getRandomNumber();
            questionsAndCorrectAnswers[i][0] = String.valueOf(question);
            questionsAndCorrectAnswers[i][1] = getCorrectEvenAnswer(question) ? "yes" : "no";
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }

}
