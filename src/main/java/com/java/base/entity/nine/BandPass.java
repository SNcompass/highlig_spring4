package com.java.base.entity.nine;

/**
 * 带通滤波器
 *
 * @author F31
 * @create 2021-02-24 15:15
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
