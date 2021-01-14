package com.java.base.controller;

import com.java.base.entity.Rock;

/**
 * 标签跳转
 *
 * @author F31
 * @create 2021-01-02 20:27
 **/
public class LabeledForController {

    public static void main(String args[]){
        int i = 0;
        outer:
        for(;true;){
            System.out.println("跳出内循环");
            inner:
            for(;i<10;i++){
                System.out.println("i=" + i);
                if(i==2){
                    System.out.println("continue");
                    continue ;
                }
                if(i==3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }

                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            new Rock(j);
        }
    }

}
