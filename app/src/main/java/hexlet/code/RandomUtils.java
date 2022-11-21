package hexlet.code;

public class RandomUtils {
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    public static int getRandomNumber() {
        final int i = (int) (Math.random() * 125);
        return i;
    }


}
