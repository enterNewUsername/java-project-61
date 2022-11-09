package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class Progression {
    private static int question = 0;
    private static String questionToText = "";
    static final String GAME_QUESTION = "What number is missing in the progression?";
    private static void getProgressionQuestion() {
        final int progressionLength = 10;
        int diff = RandomUtils.getRandomNumber();
        int firstElement = RandomUtils.getRandomNumber();
        int[] progression = makeProgression(progressionLength, firstElement, diff);
        int hiddenElementNumber = RandomUtils.getRandomNumber(0, progressionLength - 1);
        question = progression[hiddenElementNumber];
        questionToText = hideElement(progression, hiddenElementNumber);
    }
    private static String convertProgressionQuestionToText() {
        return questionToText;
    }
    private static String getCorrectProgressionAnswer() {
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
        String convertedToString = StringUtils.join(progression, ' ');
        String[] convertedToArray = convertedToString.split(" ");
        convertedToArray[elementNumber] = "..";
        return StringUtils.join(convertedToArray, ' ');
    }
    public static void runProgressionGame() {
        String[] progressionQuestionsAndCorrectAnswers = new String[RandomUtils.getMaxCountOfQuestionsAndAnswers()];
        int i = 0;
        while (i < progressionQuestionsAndCorrectAnswers.length) {
            getProgressionQuestion();
            progressionQuestionsAndCorrectAnswers[i] = convertProgressionQuestionToText();
            progressionQuestionsAndCorrectAnswers[i + 1] = getCorrectProgressionAnswer();
            i = i + 2;
        }
        Engine.mainEngine(GAME_QUESTION, progressionQuestionsAndCorrectAnswers);

    }
}
