package com.java.base.entity;

/**
 * @author F31
 * @create 2021-02-22 9:00
 */
public class Villain {

    private String name;
    protected void set(String nm){
        name = nm;
    }

    public Villain(String name){
        this.name = name;
    }

    public String toString(){
        return "I'm Villain and my name is " + name;
    }
}
