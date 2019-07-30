package a1.a1_4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Palindrome Permutation
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forward and backwards. A permutation is a rearrangement of letters. The palindrome does not need to
 * be limited to just dictionary words.
 * Example
 * Input: KAYAK
 * Output: TRUE
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("palindrome challenge")
class PalindromePermutationTest {

    PalindromePermutation palindromePermutation;

    @BeforeAll
    public void init() {
        this.palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void should_return_true_with_kayak() {
        assertTrue(palindromePermutation.check("kayak"));
    }

    @Test
    public void should_return_false_with_banana() {
        assertFalse(palindromePermutation.check("banana"));
    }

    @Test
    public void should_detect_blank_string() {
        assertThrows(RuntimeException.class, () -> palindromePermutation.check("     "));
    }
}