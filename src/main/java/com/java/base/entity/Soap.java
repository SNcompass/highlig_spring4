package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-25 21:52
 **/
public class Soap {
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString(){
        return s;
    }
}
