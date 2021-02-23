package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 14:34
 */
public class LivingCreature {

    private Characteristic p = new Characteristic("is alive");

    private Description t = new Description("Basic Living Creature");

    LivingCreature(){
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
