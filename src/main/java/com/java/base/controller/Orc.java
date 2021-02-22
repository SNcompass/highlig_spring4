package com.java.base.controller;

import com.java.base.entity.Villain;

/**
 * @author F31
 * @create 2021-02-22 9:02
 */
public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name,int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }

    public String toString(){
        return "Orc" + orcNumber + ":" + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",15);
        System.out.println(orc);
    }
}
