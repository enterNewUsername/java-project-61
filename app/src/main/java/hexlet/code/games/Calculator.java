package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    static final int COUNT_OF_OPERATIONS = 3;
    static final String GAME_QUESTION = "What is the result of the expression?";
    private static String getCalcChoice(int randomizer) {

       String[] choiceOfOperation = {
               " + ",
               " * ",
               " - ",
       };
       return choiceOfOperation[randomizer];

    }
    private static String getCorrectAnswer(String operation, int x, int y) {
        return switch (operation) {
            case " + " -> String.valueOf(x + y);
            case " - " -> String.valueOf(x - y);
            case " * " -> String.valueOf(x * y);
            default -> "Incorrect operation";
        };
    }
    public static void runCalcGame() {
        String[][] questionsAndCorrectAnswers = new String[Engine.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            int x = RandomUtils.getRandomNumber();
            int y = RandomUtils.getRandomNumber();
            String operation = getCalcChoice(RandomUtils.getRandomNumber(0, COUNT_OF_OPERATIONS - 1));

            questionsAndCorrectAnswers[i][0] = x + operation + y;
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(operation, x, y);
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }
}
