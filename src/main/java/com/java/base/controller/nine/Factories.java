package com.java.base.controller.nine;

import com.java.base.service.impl.nine.Implementation1Factory;
import com.java.base.service.impl.nine.Implementation2Factory;
import com.java.base.service.nine.Service;
import com.java.base.service.nine.ServiceFactory;


/**
 * @author F31
 * @Date 2022/01/25 11:08
 */
public class Factories{
    public static void main(String[] args) {
        serviceComsumer(new Implementation1Factory());
        serviceComsumer(new Implementation2Factory());
    }

    public static void serviceComsumer(ServiceFactory fact) {
        Service service = fact.getService();
        service.method1();
        service.method2();
        throw new NullPointerException();
    }
}
