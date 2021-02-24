package com.java.base.entity.nine;

/**
 * @author F31
 * @create 2021-02-24 15:01
 */
public class Waveform {

    private static long counter;

    private final long id = counter++;

    public String toString(){
        return "Waveform :" + id;
    }

}
