package com.java.base.controller.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author F31
 * @Date 2022/02/21 13:52
 */
public class Groups {
    static public final String POEM=
            "Twas brillig. and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s(\\S+))$").matcher(POEM);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.print("["+m.group(i)+"]");
            }
            System.out.println();
        }
    }
}
