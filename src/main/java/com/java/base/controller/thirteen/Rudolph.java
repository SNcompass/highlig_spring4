package com.java.base.controller.thirteen;

/**
 * @author F31
 * @Date 2022/02/21 10:50
 */
public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{"Rudolph","[r|R]udolph","[rR][aeiou][a-z]ol.*","R.*"}){
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
