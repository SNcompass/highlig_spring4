package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-12 18:30
 */
public class Leaf {
    int i = 0;
    public Leaf increment(){
        i++;
        return this;
    }

    public void print(){
        System.out.println("i= " + i);
    }
}
