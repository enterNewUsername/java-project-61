package hexlet.code;

public class RandomUtils {
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
