package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 14:31
 */
public class Description {

    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    protected void dispose(){
        System.out.println("Disposing Description " + s);
    }

}
