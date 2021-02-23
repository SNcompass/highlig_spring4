package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 13:51
 */
public class Sub extends Super {

    public int field = 1;

    public int getField(){
        return field;
    }

    public int getSuperField(){
        return super.getField();
    }
}
