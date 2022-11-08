package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class Progression {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "What number is missing in the progression?";
    static final int MAX_NUMBER_OF_QUESTIONS_AND_ANSWERS = 6;
    private static void getQuestion() {
        final int progressionLength = 10;
        int diff = RandomUtils.getRandomNumber();
        int firstElement = RandomUtils.getRandomNumber();
        int[] progression = makeProgression(progressionLength, firstElement, diff);
        int hiddenElementNumber = RandomUtils.getRandomNumber(0, progressionLength - 1);
        question = progression[hiddenElementNumber];
        questionToText = hideElement(progression, hiddenElementNumber);
    }
    private static String convertQuestionToText() {
        return questionToText;
    }
    private static String getCorrectAnswer() {
        return String.valueOf(question);
    }
    private static int @NotNull [] makeProgression(int progressionLength, int firstElement, int diff) {
        int[] progression = new int[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = firstElement;
            firstElement = firstElement + diff;
        }
        return progression;
    }
    private static @NotNull String hideElement(int[] progression, int elementNumber) {
        String converted = StringUtils.join(progression, ' ');
        String hiddenSym = String.valueOf(progression[elementNumber]);
        return converted.replaceAll(hiddenSym, "..");


    }
    public static void runProgressionGame() {
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
