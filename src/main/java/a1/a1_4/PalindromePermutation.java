package a1.a1_4;

/**
 * Palindrome Permutation
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forward and backwards. A permutation is a rearrangement of letters. The palindrome does not need to
 * be limited to just dictionary words.
 * Example
 * Input: KAYAK
 * Output: TRUE
 */
class PalindromePermutation {

    boolean check(String input) {

        if (input.isBlank()) {
            throw new RuntimeException("Input mustn't blank");
        }
        input = input.toLowerCase();
        int length = input.length() - 1;
        for (int i = length; i >= 0; i--) {
            if (input.charAt(i) != input.charAt(length - i)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
