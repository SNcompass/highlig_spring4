package com.java.base.entity.nine;

import com.java.base.controller.nine.StringProcessor;

import java.util.Arrays;

/**
 * @author F31
 * @create 2021-02-24 15:38
 */
public class Splitter extends StringProcessor {

    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
