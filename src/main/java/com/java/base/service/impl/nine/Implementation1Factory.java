package com.java.base.service.impl.nine;

import com.java.base.service.nine.Service;
import com.java.base.service.nine.ServiceFactory;

/**
 * @author F31
 * @Date 2022/01/25 11:06
 */
public class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}
