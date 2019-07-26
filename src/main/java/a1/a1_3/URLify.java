package a1.a1_3;

/**
 * URLify
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters, and that you are
 * given the 'true' lenght of the string.(Note: if implementing in Java, please use a character array so that you can
 * perform this operation in place)
 * Exemple:
 * input: "Hello world !    "   with finalSize: 17
 * output: "Hello%20world%20!"
 */
public class URLify {

    public static int findAllSpace(char[] chars) {
        // Increment value when find any space and return the result
        int nbSpaceFinded = 0;

        /**
         *  Get the precedent charcacter if is a space or not
         *  Boolean.TRUE : it is a character space
         *  Boolean.FALSE : it is NOT a character space
         */
        boolean precedentCharacterIsSpace = Boolean.TRUE;


        for (int i = chars.length - 1; i >= 0; i--) {
            if (' ' == chars[i] && Boolean.FALSE == precedentCharacterIsSpace) {
                nbSpaceFinded += 1;
                precedentCharacterIsSpace = Boolean.TRUE;
            } else {
                if (' ' == chars[i])
                    precedentCharacterIsSpace = Boolean.TRUE;
                else
                    precedentCharacterIsSpace = Boolean.FALSE;
            }
        }
        return nbSpaceFinded;
    }

    public String check(String url, int finalSize) {

        if (url.length() >= finalSize) {
            throw new RuntimeException("unsufficient space");
        }
        char[] chars = url.toCharArray();
        int nbSpaceCharacters = findAllSpace(chars);

        if ((nbSpaceCharacters * 2) + url.length() > finalSize) {
            throw new RuntimeException("unsufficient space");
        }
        return url.replaceAll(" ", "%20");
    }
}