package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * @author F31
 * @create 2020-09-15 13:56
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
