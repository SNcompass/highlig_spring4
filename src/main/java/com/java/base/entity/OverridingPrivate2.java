package com.java.base.entity;

/**
 * @author F31
 * @create 2021-02-22 14:35
 */
public class OverridingPrivate2 extends OverridingPrivate {

    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }

    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
