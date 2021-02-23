package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 14:41
 * @description 两栖动物
 * */
public class Amphibian extends Animal{

    private Characteristic p = new Characteristic("can live in water");

    private Description t = new Description("Both water and land");

    Amphibian(){
        System.out.println("Amphibian");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
