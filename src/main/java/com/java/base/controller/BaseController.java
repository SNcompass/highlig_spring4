package com.java.base.controller;

import com.java.base.entity.EqualsMethod;

import java.util.Random;

/**
 * java基础
 *
 * @author F31
 * @version 1.0
 * @create 2021-01-02 13:43
 **/
public class BaseController {

    public static void main(String args[]){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);

        EqualsMethod e1 = new EqualsMethod();
        EqualsMethod e2 = new EqualsMethod();

        e1.i = e2.i = 100;
        System.out.println(e1.equals(e2));
        System.out.println(e1.i);
        System.out.println(e2.i);

        System.out.println(Long.toBinaryString(100L));

        System.out.println("---------------------------------");

        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i>>>= 10;
        System.out.println(Integer.toBinaryString(i));

        Long l = -1L;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b  = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b=-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));

        Random rand = new Random(47);
        int r1 = rand.nextInt();
        int r2 = rand.nextInt();

        printBinaryInt("-1",-1);
        printBinaryInt("+1",+1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos",maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg",maxneg);
        printBinaryInt("r1",r1);
        printBinaryInt("-r1",-r1);
        printBinaryInt("~r1",~r1);

        printBinaryInt("r2",r2);

        printBinaryInt("r1&r2",r1&r2);
        printBinaryInt("r1|r2",r1|r2);
        printBinaryInt("r1^r2",r1^r2);




    }

    private static void printBinaryInt(String s,Integer i){
        System.out.println(s + "," + Integer.toBinaryString(i));
    }

    private static void printBinaryLong(String s,Long l){
        System.out.println(s + "," + Long.toBinaryString(l));
    }



}

