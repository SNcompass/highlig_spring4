package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-12 20:00
 */
public class Table {

    public static Bowl bowl1 = new Bowl(1);
    public Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    public void f2(int marker){
        System.out.println("f2(" + marker + ")");
    }

    public static Bowl bowl2 = new Bowl(2);

}
