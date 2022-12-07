package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisorGame {
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 125;
    private static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";

    public static void runGcdGame() {
        String[][] pairsOfQuestionsAndAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < pairsOfQuestionsAndAnswers.length) {
            int firstNumber = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            pairsOfQuestionsAndAnswers[i][0] = firstNumber + " " + secondNumber;
            pairsOfQuestionsAndAnswers[i][1] = String.valueOf(findGcd(firstNumber, secondNumber));
            i++;
        }
        Engine.runGame(GAME_QUESTION, pairsOfQuestionsAndAnswers);
    }

    private static int findGcd(int firstNumber, int secondNumber) {
        int temp = 0;
        if (secondNumber > firstNumber) {
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        while (firstNumber % secondNumber != 0) {
            if (firstNumber % secondNumber == 0) {
                return secondNumber;
            } else {
                temp = secondNumber;
                secondNumber = firstNumber % secondNumber;
                firstNumber = temp;
            }
        }
        return secondNumber;
    }
}

