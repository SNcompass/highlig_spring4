package com.wisely.highlight_spring4.ch1.di.contoller;

import com.wisely.highlight_spring4.ch1.di.impl.UseFunctionServiceImpl;
import com.wisely.highlight_spring4.ch1.di.config.DiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author F31
 * @create 2020-09-15 12:53
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionServiceImpl useFunctionService = context.getBean(UseFunctionServiceImpl.class);

        System.out.println(useFunctionService.useSayHello("helloworld"));

        context.close();
    }
}
