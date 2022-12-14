package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
import org.apache.commons.lang3.StringUtils;
public class ProgressionGame {
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int PROGRESSION_LENGTH = 10;
    private static final String GAME_QUESTION = "What number is missing in the progression?";

    public static void runProgressionGame() {
        String[][] pairsOfQuestionsAndAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < pairsOfQuestionsAndAnswers.length) {
            int firstElement = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int diff = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int[] progression = makeProgression(firstElement, diff, PROGRESSION_LENGTH);
            int hiddenElementNumber = RandomUtils.getRandomNumber(0, progression.length - 1);
            pairsOfQuestionsAndAnswers[i][0] = hideElement(progression, hiddenElementNumber);
            pairsOfQuestionsAndAnswers[i][1] = String.valueOf(progression[hiddenElementNumber]);
            i++;
        }
        Engine.runGame(GAME_QUESTION, pairsOfQuestionsAndAnswers);
    }

    private static int[] makeProgression(int firstElement, int diff, int progressionLength) {
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
}
