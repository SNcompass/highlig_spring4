package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-12 19:00
 */
public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
