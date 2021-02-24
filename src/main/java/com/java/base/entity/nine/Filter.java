package com.java.base.entity.nine;

/**
 * @author F31
 * @create 2021-02-24 15:03
 */
public class Filter {

    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
