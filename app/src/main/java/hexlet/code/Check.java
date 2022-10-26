package hexlet.code;

import hexlet.code.games.Gcd;

public class Check {
    public static boolean checkEven(int question, String answer) {
        if ((question % 2 == 0 && answer.equals("yes")) || (question % 2 != 0 && answer.equals("no"))) {
            System.out.println("Correct!");
            return true;
        }
        String correctAnswer = question % 2 == 0 ? "yes" : "no";
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + correctAnswer + "'");
        return false;
    }

    public static boolean checkCalc(int question, String answer) {
        if (String.valueOf(question).equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + question + "'");
        return false;
    }

    public static boolean checkGcd(int a, int b, String answer) {
        if (String.valueOf(Gcd.findGcd(a, b)).equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + Gcd.findGcd(a, b) + "'");
        return false;
    }
}
