package com.java.base.entity;

/**
 * @author F31
 * @create 2021-01-25 21:53
 **/
public class Bath {
    private String
    s1 = "Happy1",
    s2 = "Happy2",
    s3,s4;

    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    { i = 47; }

    @Override
    public String toString(){
        if(s4 == null){
            s4 = "Joy";
        }
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille ;
    }

}
