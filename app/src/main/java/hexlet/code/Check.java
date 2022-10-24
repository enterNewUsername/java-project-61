package hexlet.code;

public class Check {
    public static boolean checkEven(int question, String answer) {
        if ((question % 2 == 0 && answer.equals("yes")) || (question % 2 != 0 && answer.equals("no")))     {
            System.out.println("Correct!");
            return true;
        }
        String correctAnswer = question % 2 == 0 ? "yes" : "no";
        System.out.print("'" + answer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + correctAnswer + "'");
        return false;
    }
}
