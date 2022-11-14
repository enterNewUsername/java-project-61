package hexlet.code;

public class RandomUtils {
    static final int COUNT_OF_QUESTIONS = 3;
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    public static int getRandomNumber() {
        final int i = (int) (Math.random() * 125);
        return i;
    }
    public static int getCountOfQuestions() {
        return COUNT_OF_QUESTIONS;
    }


}
