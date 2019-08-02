package a1.a1_2;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Check Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
@DisplayName("Test URLify challenge")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PermutationTest {

    static Permutation permutation;

    @BeforeAll
    static void init() {
        permutation = new Permutation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"pplea", "pleap", "leapp", "eappl", "elppa", "leppa"})
    @NullAndEmptySource
    void should_success_permutation_from_apple(String expected) {
        assertTrue(permutation.check("apple", expected));
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "snake", "banana"})
    void should_fail(String notExpected) {
        assertFalse(permutation.check("apple", notExpected));
    }

    @Test
    void should_success_with_numbers_strings() {
        assertTrue(permutation.check("1234", "4321"));
    }

    @Test
    void should_fail_no_permutation_with_numbers_strings() {
        assertFalse(permutation.check("1234", "1234"));
    }

    @Test
    void should_success_with_special_characters() {
        assertTrue(permutation.check("&éù%", "%ùé&"));
    }

    @Test
    void should_fail_no_permutation_with_special_characters() {
        assertFalse(permutation.check("&éù%", "&éù%"));
    }
}