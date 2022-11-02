package hexlet.code.games;

import hexlet.code.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class Progression {

    private static int question = 0;

    private static String questionToText = "";

    public static void getQuestion() {
        final int progressionLength = 10;
        int[] progression = makeProgression(progressionLength);
        int hiddenElementNumber = RandomUtils.getRndNum(0, progressionLength - 1);
        question = progression[hiddenElementNumber];
        questionToText = hideElement(progression, hiddenElementNumber);
    }

    public static String convertQuestionToText() {
        return questionToText;
    }

    public static String getCorrectAnswer() {
        return String.valueOf(question);
    }


    public static int @NotNull [] makeProgression(int progressionLength) {
        int diff = RandomUtils.getRndNum();
        int first = RandomUtils.getRndNum();
        int[] progression = new int[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = first;
            first = first + diff;
        }
        return progression;
    }

    public static @NotNull String hideElement(int[] progression, int elementNumber) {
        String converted = StringUtils.join(progression, ' ');
        String hiddenSym = String.valueOf(progression[elementNumber]);
        return converted.replaceAll(hiddenSym, "..");


    }

    public static boolean checkProgression(String answer) {
        return String.valueOf(question).equals(answer);
    }
}
