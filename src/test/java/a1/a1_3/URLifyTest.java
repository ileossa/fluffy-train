package a1.a1_3;

import org.junit.jupiter.api.*;

/* URLify
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters, and that you are
 * given the 'true' lenght of the string.(Note: if implementing in Java, please use a character array so that you can
 * perform this operation in place)
 */
@DisplayName("Test URLify challenge")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class URLifyTest {

    @Test
    public void should_succeed_return_the_url_refactored() {
        URLify urLify = new URLify();
        String result = urLify.check("hello world !", 20);
        Assertions.assertEquals("hello%20world%20!", result);
    }

    @Test
    public void should_succeed_if_length_of_the_input_is_less_than_size() {
        URLify urLify = new URLify();
        String result = urLify.check("hello world !", 100);
        Assertions.assertEquals("hello%20world%20!", result);
    }

    @Test
    public void should_failed_if_length_of_the_input_is_more_than_size() {
        URLify urLify = new URLify();
        Assertions.assertThrows(RuntimeException.class, () -> {
            urLify.check("hello world !", 1);
        });
    }


    @Nested
    @DisplayName("method findSpace() - Test")
    public static class MethodFindSpaceTest {
        @Test
        public void should_find_0_space() {
            int nbSpaceFind = URLify.findAllSpace("noSpace".toCharArray());
            Assertions.assertEquals(nbSpaceFind, 0);
        }

        @Test
        public void should_find_5_space() {
            int nbSpaceFind = URLify.findAllSpace("0 1 2 3 4 5 6".toCharArray());
            Assertions.assertEquals(nbSpaceFind, 6);
        }

        @Test
        public void should_find_1_space_and_no_take_space_at_the_end() {
            int nbSpaceFind = URLify.findAllSpace("hello world           ".toCharArray());
            Assertions.assertEquals(nbSpaceFind, 1);
        }
    }
}