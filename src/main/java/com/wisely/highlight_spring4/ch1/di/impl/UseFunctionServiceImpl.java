package com.wisely.highlight_spring4.ch1.di.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author F31
 * @create 2020-09-15 12:42
 **/
@Service
public class UseFunctionServiceImpl {

    @Autowired
    private FunctionServiceImpl functionService;

    public String useSayHello(String word){
        return functionService.sayHello(word);
    }

}
