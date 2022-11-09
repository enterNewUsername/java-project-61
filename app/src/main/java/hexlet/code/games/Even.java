package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static int question;
    static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static void getEvenQuestion() {
        question = RandomUtils.getRandomNumber();
    }
    private static String convertEvenQuestionToText() {
        return String.valueOf(question);
    }
    private static String getCorrectEvenAnswer() {
        return isEven() ? "yes" : "no";
    }
    private static boolean isEven() {
        return question % 2 == 0;
    }
    public static void runEvenGame() {
        String[] arrayOfQuestionsAndCorrectAnswers = new String[RandomUtils.getMaxCountOfQuestionsAndAnswers()];
        int i = 0;
        while (i < arrayOfQuestionsAndCorrectAnswers.length) {
            getEvenQuestion();
            arrayOfQuestionsAndCorrectAnswers[i] = convertEvenQuestionToText();
            arrayOfQuestionsAndCorrectAnswers[i + 1] = getCorrectEvenAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, arrayOfQuestionsAndCorrectAnswers);

    }

}
