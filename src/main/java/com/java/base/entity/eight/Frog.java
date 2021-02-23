package com.java.base.entity.eight;

/**
 * 青蛙
 *
 * @author F31
 * @create 2021-02-23 14:44
 */
public class Frog extends Amphibian {

    private Characteristic p = new Characteristic("Croaks");

    private Description t = new Description("Eats bugs");

    public Frog(){
        System.out.println("Frog()");
    }

    @Override
    public void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
