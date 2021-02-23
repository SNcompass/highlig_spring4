package com.java.base.test;

import com.java.base.controller.Burrito;
import com.java.base.entity.*;
import com.java.base.entity.eight.*;
import org.junit.Test;

/**
 * @author F31
 * @create 2021-01-12 18:32
 */
public class MainTest {

    @Test
    /**
     * 测试this返回当前对象
     */
    public void test1(){
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }

    @Test
    public void test2(){
        new Person().eat(new Apple());
    }

    @Test
    public void test3(){
        Flower x = new Flower();
        x.printPetalCount();
    }

    @Test
    public void SimpleEnumUse(){
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ".ordinal" + s.ordinal());
        }

        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChild = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChild.describe();
        jalapeno.describe();

    }

    @Test
    public void soap(){
        Bath b = new Bath();
        System.out.println(b);
    }

    @Test
    public void superAndSupField(){
        Super sup = new Sub();
        System.out.println(sup.field);
        System.out.println(sup.getField());

        Sub sub = new Sub();
        System.out.println(sub.field + " " + sub.getField() + " " + sub.getSuperField());

    }

    @Test
    public void frog(){
        Frog frog = new Frog();
        System.out.println("BYE");
        frog.dispose();
    }

    @Test
    public void referenceCounting(){
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
        for(Composing composing : composings){
            composing.dispose();
        }
    }
}
