package hexlet.code.games;

import hexlet.code.RandomUtils;

public class Prime {
    private static int question;

    public static void getQuestion() {
        question = RandomUtils.getRndNum();
    }

    public static String convertQuestionToText() {
        return String.valueOf(question);
    }

    public static String getCorrectAnswer() {
        return isPrime() ? "yes" : "no";
    }

    public static boolean checkPrime(String answer) {
        return (isPrime() && answer.equals("yes")) || (!isPrime() && answer.equals("no"));
    }

    private static boolean isPrime() {
        if (question < 2) {
            return false;
        }
        int divider = 2;
        while (divider < question / 2) {
            if (question % divider != 0) {
                divider++;
            } else {
                return false;
            }
        }
        return true;
    }
}
