package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @author F31
 * @create 2020-09-15 15:59
 **/
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){

    }

}
