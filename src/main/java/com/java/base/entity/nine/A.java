package com.java.base.entity.nine;

/**
 * 嵌套接口
 *
 * @author F31
 * @create 2021-03-11 14:14
 */
public class A {
    interface B{
        void f();
    }
    public class BImp implements B{
        public void f(){

        }
    }
    private class BImp2 implements B {
        public void f(){

        }
    }

    public interface C{
        void f();
    }
    class CImp implements C{
        @Override
        public void f() {

        }
    }
    private class CImp2 implements C{
        @Override
        public void f() {

        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D{

        @Override
        public void f() {

        }
    }
    public class DImp2 implements D{

        @Override
        public void f() {

        }
    }

    public D getD(){
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }

}
