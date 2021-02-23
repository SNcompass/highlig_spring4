package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 14:38
 */
public class Animal extends LivingCreature {

    private Characteristic p = new Characteristic("has heart");

    private Description t = new Description("Animal not vegetable");

    Animal(){
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
