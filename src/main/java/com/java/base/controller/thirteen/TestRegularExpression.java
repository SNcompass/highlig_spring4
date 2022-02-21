package com.java.base.controller.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author F31
 * @Date 2022/02/21 11:02
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"" );
        for (String arg : args) {
            System.out.println("Regular expression:\"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at position " + m.start()  + "-" + (m.end()-1));
            }
        }
    }
}
