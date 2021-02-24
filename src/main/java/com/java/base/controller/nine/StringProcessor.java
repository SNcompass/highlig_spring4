package com.java.base.controller.nine;

import com.java.base.entity.nine.DownCase;
import com.java.base.entity.nine.Processor;
import com.java.base.entity.nine.Splitter;
import com.java.base.entity.nine.Upcase;

/**
 * @author F31
 * @create 2021-02-24 16:03
 */
public abstract class StringProcessor implements Processor {


    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);

    public static String s = "If she weights the same as a duck,she's made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new DownCase(),s);
        Apply.process(new Splitter(),s);
    }

}
