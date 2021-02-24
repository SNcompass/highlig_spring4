package com.java.base.entity.nine;

/**
 * 低通滤波器
 * @author F31
 * @create 2021-02-24 15:05
 */
public class LowPass extends Filter {

    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
