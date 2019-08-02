package a1.a1_5;

import java.util.stream.IntStream;

import static java.lang.Boolean.*;

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
public class OneAway {


    public boolean check(String input, String output) {

        char[] inputChars = input.toCharArray();
        char[] outputChars = output.toCharArray();

        if(inputChars.length == outputChars.length)
        {
            System.out.println("meme taille");
            sameLenght(inputChars, outputChars);
        }
        else if( inputChars.length > outputChars.length){
            System.out.println("input plus grand");
        }else{
            System.out.println("output plus grand");
        }


//        if () return Boolean.FALSE;

        return TRUE;
    }



    protected boolean sameLenght(char[] inputChars, char[] outputChars) {
        for (int i = 0; i < inputChars.length; i++) {
            System.out.println(inputChars[i]+" == "+outputChars[i]);
            if(inputChars[i] != outputChars[i]){
                System.out.println(inputChars[i]+" != "+outputChars[i+1]);
                if(inputChars[i] != outputChars[++i]){
                    System.out.println(inputChars[i]+" 1!= "+outputChars[i+1]);
                    return true;
                }
            }
        }
        return TRUE;
    }
}
