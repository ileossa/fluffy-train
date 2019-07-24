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
        Assertions.assertTrue(permutation.check("bla", "bla"));
    }
}