package com.java.base.test;

import com.java.base.entity.Apple;
import com.java.base.entity.Flower;
import com.java.base.entity.Leaf;
import com.java.base.entity.Person;
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


}
