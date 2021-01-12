package com.java.base.controller;


import com.java.base.entity.Leaf;

import java.util.Date;

/**
 * @author F31
 * @create 2020-12-25 15:53
 */
public class HelloData {

    public static void main(String args[]){
        System.out.println("hello data:");
        System.out.println(new Date());

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));


    }

}
