package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    static final int MIN_RANDOM_NUMBER = 0;
    static final int MAX_RANDOM_NUMBER = 125;
    static final String[] CALC_OPERATIONS = {
            " + ",
            " * ",
            " - ",
    };
    static final String GAME_QUESTION = "What is the result of the expression?";
    public static void runCalcGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int x = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int y = RandomUtils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String operation = CALC_OPERATIONS[RandomUtils.getRandomNumber(0, CALC_OPERATIONS.length - 1)];
            questionsAndCorrectAnswers[i][0] = x + operation + y;
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(operation, x, y);
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);
    }
    private static String getCorrectAnswer(String operation, int x, int y) {
        return switch (operation) {
            case " + " -> String.valueOf(x + y);
            case " - " -> String.valueOf(x - y);
            case " * " -> String.valueOf(x * y);
            default -> "Incorrect operation";
        };
    }
}
