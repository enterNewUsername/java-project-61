package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;

public class Check {
    public static boolean checkEven(int question, String answer) {
        if ((question % 2 == 0 && answer.equals("yes")) || (question % 2 != 0 && answer.equals("no"))) {
            System.out.println("Correct!");
            return true;
        }
        String correctAnswer = question % 2 == 0 ? "yes" : "no";
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + correctAnswer + "'");
        Engine.gameOver();
        return false;
    }

    public static boolean checkCalc(int question, String answer) {
        if (String.valueOf(question).equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + question + "'");
        Engine.gameOver();
        return false;
    }

    public static boolean checkGcd(int a, int b, String answer) {
        if (String.valueOf(Gcd.findGcd(a, b)).equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + Gcd.findGcd(a, b) + "'");
        Engine.gameOver();
        return false;
    }

    public static boolean checkProgression(int[] progression, int hideElementNumber, String answer) {
        if (String.valueOf(progression[hideElementNumber]).equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + progression[hideElementNumber] + "'");
        Engine.gameOver();
        return false;
    }

    public static boolean checkPrime(int question, String answer) {
        String correctAnswer = Prime.isPrime(question) ? "yes" : "no";
        if ((Prime.isPrime(question) && answer.equals("yes")) || (!Prime.isPrime(question) && answer.equals("no"))) {
            System.out.println("Correct!");
            return true;
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + correctAnswer + "'" + question);
        Engine.gameOver();
        return false;
    }


}
