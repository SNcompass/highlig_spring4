package com.java.base.entity.eight;

/**
 * @author F31
 * @create 2021-02-24 16:26
 */
public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }

    Glyph(){
        System.out.println("Glyph before draw()");
        draw();
        System.out.println("Glyph after draw()");
    }
}
