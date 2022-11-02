package hexlet.code.games;

import hexlet.code.RandomUtils;

public class Gcd {

    private static int question = 0;
    private static String questionToText = "";

    public static void getQuestion() {
        int a = RandomUtils.getRndNum() + 1;
        int b = RandomUtils.getRndNum() + 1;
        questionToText = a + " " + b;
        question = findGcd(a, b);
    }

    public static String convertQuestionToText() {
        return questionToText;
    }

    public static String getCorrectAnswer() {
        return String.valueOf(question);
    }

    public static boolean checkGcd(String answer) {
        return  String.valueOf(question).equals(answer);
    }


    public static int findGcd(int a, int b) {
        int temp = 0;
        if (b > a) {
            temp = b;
            b = a;
            a = temp;
        }
        while (a % b != 0) {
            if (a % b == 0) {
                return b;
            } else {
                temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }

}

