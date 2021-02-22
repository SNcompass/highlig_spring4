package com.java.base.entity;

/**
 * @author F31
 * @create 2021-02-22 14:35
 */
public class OverridingPrivate extends WithFinals {

    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }

    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
