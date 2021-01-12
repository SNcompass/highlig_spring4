package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-12 19:06
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    public Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor int are only,petalCount= " + petalCount);
    }

    public Flower(String ss){
        System.out.println("Constructor String are only, s = " + ss);
    }

    public Flower(String s,int petals){
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    public Flower(){
        this("hi",47);
        System.out.println("default constructor ()");
    }

    public void printPetalCount(){
        System.out.println("petalCount = " + petalCount + " s=" + s);
    }
}
