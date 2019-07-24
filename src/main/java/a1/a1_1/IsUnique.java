package a1.a1_1;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures ?
 */
public class IsUnique {

    public boolean check(String input) {
        var uniqueLetters = new HashSet<Character>(input.length());
        for (Character letter : input.toCharArray()) {
            boolean isNotPresent = uniqueLetters.add(letter);
            if (isNotPresent == Boolean.FALSE) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
