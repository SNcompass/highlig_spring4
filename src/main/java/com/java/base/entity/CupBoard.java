package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-13 9:10
 */
public class CupBoard {

    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public CupBoard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    public void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);

}
