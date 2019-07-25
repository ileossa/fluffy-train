package a1.a1_2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Check Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
class PermutationTest {


    @Test
    public void should_return_true_with_two_strings_permutation() {
        Permutation permutation = new Permutation();
        Assertions.assertTrue(permutation.check("apple", "elppa"));
    }


    @Test
    public void should_return_false_with_two_differents_string() {
        Permutation permutation = new Permutation();
        Assertions.assertFalse(permutation.check("apple", "snake"));
    }

    @Test
    public void should_return_false_with_string_not_smae_lenght() {
        Permutation permutation = new Permutation();
        Assertions.assertFalse(permutation.check("apple", "banana"));
    }
}