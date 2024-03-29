package com.java.base.controller.nine;

import com.java.base.entity.nine.*;

/**
 * @author F31
 * @create 2021-02-24 15:40
 */
public class Apply {

    public static void process(Processor p,Object s){
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new DownCase(),s);
        process(new Splitter(),s);
    }
}
