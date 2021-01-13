package com.java.base.controller;


import com.java.base.entity.CupBoard;
import com.java.base.entity.Leaf;
import com.java.base.entity.Table;

import java.util.Date;

/**
 * @author F31
 * @create 2020-12-25 15:53
 */
public class HelloData {

    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();


    public static void main(String args[]){
        /*System.out.println("hello data:");
        System.out.println(new Date());

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));*/

        System.out.println("creating new Cupboard() in main");
        new CupBoard();
        System.out.println("Creating new Cupboard() in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);
    }

}
