package a1.a1_2;


import org.junit.jupiter.api.*;

/**
 * Check Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
@DisplayName("Test URLify challenge")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
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

    @Test
    public void should_return_true_with_numbers_strings() {
        Permutation permutation = new Permutation();
        Assertions.assertTrue(permutation.check("1234", "4321"));
    }

    @Test
    public void should_return_false_no_permutation_with_numbers_strings() {
        Permutation permutation = new Permutation();
        Assertions.assertFalse(permutation.check("1234", "1234"));
    }

    @Test
    public void should_return_true_with_special_characters() {
        Permutation permutation = new Permutation();
        Assertions.assertTrue(permutation.check("&éù%", "%ùé&"));
    }

    @Test
    public void should_return_false_no_permutation_with_special_characters() {
        Permutation permutation = new Permutation();
        Assertions.assertFalse(permutation.check("&éù%", "&éù%"));
    }
}