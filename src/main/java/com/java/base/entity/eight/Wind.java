package com.java.base.entity.eight;

import com.java.base.entity.Note;
import com.java.base.entity.eight.Instrument;

/**
 * @author F31
 * @create 2021-02-22 17:02
 */
public class Wind extends Instrument {
     public void play(Note n) {
         System.out.println("Wind.play()" + n);
     }
}
