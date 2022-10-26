package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
public class Progression {
    public static void progressionGame() {
        // Count of correct answers
        int countCorrect = 0;
        Scanner scanner = new Scanner(System.in);

        Engine.hello();

        System.out.print("What number is missing in the progression?");
        while (countCorrect < 3) {
            int[] progression = makeProgression();
            int hideElementNumber = Engine.getRndNum(0, progression.length - 1);
            System.out.println("Question: " + hideElement(progression, hideElementNumber));
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkProgression(progression, hideElementNumber, answer)) {
                countCorrect++;
            } else {
                return;
            }
        }
        Engine.congrats();
        scanner.close();
    }

    public static int @NotNull [] makeProgression() {
        int length = Engine.getRndNum(7, 12);
        int diff = Engine.getRndNum(2, 9);
        int first = Engine.getRndNum(1, 99);
        int[] progression = new int[length];
        for (var i = 0; i < length; i++) {
            progression[i] = first;
            first = first + diff;
        }
        return progression;
    }

    public static @NotNull String hideElement(int[] progression, int elementNumber) {
        String converted = StringUtils.join(progression, ' ');
        String hiddenSym = String.valueOf(progression[elementNumber]);
        return converted.replaceAll(hiddenSym, "..");


    }
}
