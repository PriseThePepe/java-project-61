package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
    public static int generateRandomNumberInRange(int origin, int bound) {
        Random random = new Random();
        return random.nextInt(origin, bound);
    }
}
