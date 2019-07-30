package a1.a1_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

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

    @Test
    void should_return_true_with_input_pale_output_ple() {

    }

    @Test
    void should_return_true_with_input_pales_output_pale() {

    }

    @Test
    void should_return_true_with_input_pale_output_bale() {
    }


    @Test
    void should_return_false_with_input_pale_output_bake() {
    }

}