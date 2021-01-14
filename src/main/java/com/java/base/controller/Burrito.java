package com.java.base.controller;

import com.java.base.entity.Spiciness;

/**
 * @author F31
 * @create 2021-01-14 22:58
 **/
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
                default:
                System.out.println("maybe too hot");
        }
    }
}
