package com.java.base.controller.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author F31
 * @Date 2022/02/21 15:05
 */
public class StartEnd {
    public static String input =
            "As Long as there is injustice, whenever a\n" +
                    "Targathian baby cries out, wherever a distress\n" +
                    "signal sounds among the stars  ... We'll be there.\n" +
                    "This fine ship, adn this fine crew ...\n" +
                    "Never give up! Never surrender!";

    public static class Display{
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex){this.regex = regex;}
        void display(String message){
            if(!regexPrinted){
                System.out.println(regex);
                regexPrinted = true;
            }
            System  .out.println(message);
        }
    }
    static void examine(String s,String regex){
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            d.display("find() '" + m.group() + "' start=" + m.start() + " end = " + m.end());
            //调用lookingAt和matches方法之后，m.find又变为true，无限循环
            if(m.lookingAt()){
                d.display("lookingAt() start=" + m.start() + " end = " + m.end());
            }
            if(m.matches()){
                d.display("find() start=" + m.start() + " end = " + m.end());
            }
        }
    }

    public static void main(String[] args) {
        for(String in : input.split("\n")){
            System.out.println("input: " + in);
            for(String regex : new String[]{"\\w*ere\\w*","\\w*ere","T\\w+","Never.*?!"}){
                examine(in,regex);
            }
        }
    }
}