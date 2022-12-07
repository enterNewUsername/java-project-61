package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class CalculatorGame {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 125;
    private static final String[] CALC_OPERATIONS = {
            " + ",
            " * ",
            " - ",
    };
    private static final String GAME_QUESTION = "What is the result of the expression?";

    public static void runCalcGame() {
        String[][] pairsOfQuestionsAndAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < pairsOfQuestionsAndAnswers.length) {
            int firstElementOfExpression = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondElementOfExpression = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String operation = CALC_OPERATIONS[RandomUtils.getRandomNumber(0, CALC_OPERATIONS.length - 1)];
            pairsOfQuestionsAndAnswers[i][0] = firstElementOfExpression + operation + secondElementOfExpression;
            pairsOfQuestionsAndAnswers[i][1] =
                    getCorrectAnswer(operation, firstElementOfExpression, secondElementOfExpression);
            i++;
        }
        Engine.runGame(GAME_QUESTION, pairsOfQuestionsAndAnswers);
    }

    private static String getCorrectAnswer(String operation,
                                           int firstElementOfExpression,
                                           int secondElementOfExpression) {
        return switch (operation) {
            case " + " -> String.valueOf(firstElementOfExpression + secondElementOfExpression);
            case " - " -> String.valueOf(firstElementOfExpression - secondElementOfExpression);
            case " * " -> String.valueOf(firstElementOfExpression * secondElementOfExpression);
            default -> "Incorrect operation";
        };
    }
}
