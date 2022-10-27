package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.Engine;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

import static hexlet.code.Engine.getCountCorrect;

public class Progression {
    public static void progressionGame() {
        Engine.hello();

        System.out.println("What number is missing in the progression?");
        int countCorrect = getCountCorrect();
        while (countCorrect >= -1) {
            Scanner scanner = new Scanner(System.in);
            final int progressionLength = 10;
            int[] progression = makeProgression(progressionLength);
            int hideElementNumber = Engine.getRndNum(0, progression.length - 1);
            System.out.println("Question: " + hideElement(progression, hideElementNumber));
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (Check.checkProgression(progression, hideElementNumber, answer)) {
                countCorrect--;
            } else {
                return;
            }
        }
        Engine.congrats();
    }

    public static int @NotNull [] makeProgression(int progressionLength) {
        int diff = Engine.getRndNum();
        int first = Engine.getRndNum();
        int[] progression = new int[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
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
