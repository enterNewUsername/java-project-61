package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static int question;
    static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS = 6;
    private static void getQuestion() {
        question = RandomUtils.getRandomNumber();
    }
    private static String convertQuestionToText() {
        return String.valueOf(question);
    }
    private static String getCorrectAnswer() {
        return isEven() ? "yes" : "no";
    }
    private static boolean isEven() {
        return question % 2 == 0;
    }
    public static void runEvenGame() {
        String[] arrayOfQuestionsAndCorrectAnswers = new String[MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS];
        int i = 0;
        while (i < arrayOfQuestionsAndCorrectAnswers.length) {
            getQuestion();
            arrayOfQuestionsAndCorrectAnswers[i] = convertQuestionToText();
            arrayOfQuestionsAndCorrectAnswers[i + 1] = getCorrectAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, arrayOfQuestionsAndCorrectAnswers);

    }

}
