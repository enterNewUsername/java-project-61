package hexlet.code.games;

import hexlet.code.RandomUtils;

public class Even {
    private static int question;

    public static void getQuestion() {
        question = RandomUtils.getRndNum();
    }

    public static String convertQuestionToText() {
        return String.valueOf(question);
    }

    public static String getCorrectAnswer() {
        return isEven() ? "yes" : "no";
    }

    public static boolean checkEven(String answer) {
        return ((isEven() && answer.equals("yes")) || (!isEven() && answer.equals("no")));

    }

    public static boolean isEven() {
        return question % 2 == 0;
    }

}
