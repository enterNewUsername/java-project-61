package hexlet.code;

public class RandomUtils {
    static final int MAX_COUNT_OF_QUESTIONS_AND_ANSWERS = 6;
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    public static int getRandomNumber() {
        final int i = (int) (Math.random() * 125);
        return i;
    }
    public static int getMaxCountOfQuestionsAndAnswers() {
        return MAX_COUNT_OF_QUESTIONS_AND_ANSWERS;
    }


}
