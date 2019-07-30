package a1.a1_2;

/**
 * Check Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Permutation {
    public boolean check(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return Boolean.FALSE;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str1.length() - 1 - i)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
