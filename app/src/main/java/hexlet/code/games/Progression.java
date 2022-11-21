package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
import org.apache.commons.lang3.StringUtils;
public class Progression {
    static final String GAME_QUESTION = "What number is missing in the progression?";
    private static int[] makeProgression() {

        final int progressionLength = 10;
        int diff = RandomUtils.getRandomNumber();
        int firstElement = RandomUtils.getRandomNumber();

        int[] progression = new int[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = firstElement;
            firstElement = firstElement + diff;
        }
        return progression;
    }
    private static String hideElement(int[] progression, int elementNumber) {
        String convertedToString = StringUtils.join(progression, ' ');
        String[] convertedToArray = convertedToString.split(" ");
        convertedToArray[elementNumber] = "..";
        return StringUtils.join(convertedToArray, ' ');
    }
    public static void runProgressionGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int[] progression = makeProgression();
            int hiddenElementNumber = RandomUtils.getRandomNumber(0, progression.length - 1);
            questionsAndCorrectAnswers[i][0] = hideElement(progression, hiddenElementNumber);
            questionsAndCorrectAnswers[i][1] = String.valueOf(progression[hiddenElementNumber]);
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }
}
