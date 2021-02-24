package com.java.base.entity.nine;

import com.java.base.controller.nine.StringProcessor;

/**
 * @author F31
 * @create 2021-02-24 15:36
 */
public class Upcase extends StringProcessor {

    public String process(Object input){
        return ((String)input).toUpperCase();
    }

}
