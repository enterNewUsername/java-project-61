package hexlet.code.games;

import hexlet.code.RandomUtils;

public class Calc {
    private static int question = 0;
    private static String questionToText = "";

    public static void getQuestion() {
        calcChoice();
    }

    public static String convertQuestionToText() {
        return questionToText;
    }

    public static String getCorrectAnswer() {
        return String.valueOf(question);
    }

    public static boolean checkCalc(String answer) {
        return String.valueOf(question).equals(answer);
    }


    public static void calcChoice() {
        String choice = String.valueOf(RandomUtils.getRndNum(-1, 1));
       int x = RandomUtils.getRndNum();
       int y = RandomUtils.getRndNum();

        switch (choice) {
            case "-1" -> {
                questionToText = x + " + " + y;
                question = x + y;
            }
            case "0" -> {
                questionToText = x + " - " + y;
                question = x - y;
            }
            case "1" -> {
                questionToText = x + " * " + y;
                question = x * y;
            }
            default -> {
                System.out.print("Something went wrong with this game, sorry!");
            }
        }

    }
}
