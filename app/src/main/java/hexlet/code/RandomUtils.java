package hexlet.code;

public class RandomUtils {
    public static int getRndNum(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static int getRndNum() {
        final int i = (int) (Math.random() * 125);
        return i;
    }
}
