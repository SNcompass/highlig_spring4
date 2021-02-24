package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-24 16:28
 */
public class RoundGlyph extends Glyph {

    private int radius = 1;

    public RoundGlyph(int i){

        radius = i;
        System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(),radius = " + radius);
    }
}
