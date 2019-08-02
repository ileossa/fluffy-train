package a1.a1_5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a
 * character. Given two strings, write a function to check if they are one edit(or zero edits) aways.
 * <p>
 * Example:
 * pale,  ple     -> true
 * pales, pale    -> true
 * pale,  bale    -> true
 * pale,  bake    -> false
 */

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("One away challenge")
class OneAwayTest {

    static OneAway oneAway;

    @BeforeAll
    public static void init(){
        oneAway = new OneAway();
    }

    @Test
    void should_return_true_with_input_pale_output_ple() {
        assertTrue(oneAway.check("pale", "ple"));
    }

    @Test
    void should_return_true_with_input_pales_output_pale() {
        assertTrue(oneAway.check("pales", "pale"));
    }

    @Test
    void should_return_true_with_input_pale_output_bale() {
        assertTrue(oneAway.check("pale", "bale"));
    }


    @Test
    void should_return_false_with_input_pale_output_bake() {
        assertFalse(oneAway.check("pale", "bake"));
    }

    @Nested
    @DisplayName("private method to check two strings with same lenght")
    class sameLength {

        @Test
        void should_succes_with_pale_pale(){
            assertTrue(oneAway.sameLenght("pale".toCharArray(), "pale".toCharArray()));
        }

        @Test
        void should_fail_with_two_differents_letters(){
            assertFalse(oneAway.sameLenght("pale".toCharArray(), "babe".toCharArray()));
        }
    }

}