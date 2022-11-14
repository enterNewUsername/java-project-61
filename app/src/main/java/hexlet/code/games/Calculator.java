package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    static final int COUNT_OF_OPERATIONS = 3;
    static final String GAME_QUESTION = "What is the result of the expression?";
    private static String[] getCalcChoice(int randomizer) {
       int x = RandomUtils.getRandomNumber();
       int y = RandomUtils.getRandomNumber();

       String[][] choiceOfOperation = {
               {x + " + " + y, String.valueOf(x + y)},
               {x + " * " + y, String.valueOf(x * y)},
               {x + " - " + y, String.valueOf(x - y)},
       };
       return choiceOfOperation[randomizer];

    }
    public static void runCalcGame() {
        String[][] questionsAndCorrectAnswers = new String[RandomUtils.getCountOfQuestions()][2];
        int i = 0;
        while (i < questionsAndCorrectAnswers.length) {
            questionsAndCorrectAnswers[i] = getCalcChoice(RandomUtils.getRandomNumber(0, COUNT_OF_OPERATIONS));
            i++;
        }
        Engine.runGame(GAME_QUESTION, questionsAndCorrectAnswers);

    }
}
