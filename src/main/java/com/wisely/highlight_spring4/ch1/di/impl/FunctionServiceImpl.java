package com.wisely.highlight_spring4.ch1.di.impl;

import org.springframework.stereotype.Service;

/**
 * @author F31
 * @create 2020-09-15 12:41
 **/
@Service
public class FunctionServiceImpl {

    public String sayHello(String word){
        return "hello " + word + " !";
    }
}
