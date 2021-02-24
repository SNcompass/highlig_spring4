package com.java.base.entity.nine;

/**
 * 高通滤波器
 * @author F31
 * @create 2021-02-24 15:09
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }

}
