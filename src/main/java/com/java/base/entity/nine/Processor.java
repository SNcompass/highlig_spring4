package com.java.base.entity.nine;

/**
 * @author F31
 * @create 2021-02-24 15:35
 */
public interface Processor {
    String name();

    Object process(Object input);
}
