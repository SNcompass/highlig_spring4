package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-23 16:14
 */
public class Shared {

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Creating " + this);
    }
    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(--refcount == 0){
            System.out.println("Disposing" + this);
        }
    }

    public String toString(){
        return "Shared " + id;
    }
}
