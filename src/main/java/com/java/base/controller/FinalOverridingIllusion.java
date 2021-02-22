package com.java.base.controller;

import com.java.base.entity.OverridingPrivate;
import com.java.base.entity.OverridingPrivate2;
import com.java.base.entity.WithFinals;

/**
 * @author F31
 * @create 2021-02-22 14:40
 */
public class FinalOverridingIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op1 = op2;

        WithFinals wf = op2;
    }
}
