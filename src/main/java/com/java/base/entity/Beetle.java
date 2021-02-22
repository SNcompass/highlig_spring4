package com.java.base.entity;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author F31
 * @create 2021-02-22 15:06
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle(){
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 = printInit("static Beelte.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle counstructor");
        Beetle b = new Beetle();
    }

}
