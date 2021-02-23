package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 14:28
 */
public class Characteristic {

    private String s;

    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose(){
        System.out.println("disposing Characteristic " + s);
    }

}
