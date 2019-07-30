package a1.a1_1;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures ?
 *
 * @see a1.a1_1.IsUnique#check(String)
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class IsUniqueTest {

    IsUnique isUnique = new IsUnique();


    @Test
    @Description("Check if the function return true")
    public void method_return_true() {
        boolean resultTrue = isUnique.check("bla");
        assertEquals(resultTrue, TRUE);
    }

    @Test
    public void methode_should_return_false() {
        boolean resutlFalse = isUnique.check("foobar");
        assertEquals(resutlFalse, FALSE);
    }
}