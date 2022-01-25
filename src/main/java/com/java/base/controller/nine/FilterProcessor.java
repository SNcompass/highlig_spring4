package com.java.base.controller.nine;

import com.java.base.entity.nine.*;

/**
 * @author F31
 * @create 2021-03-03 14:30
 */
public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }

}
