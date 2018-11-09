package com.jvm.jdk8;

/**
 * Created by LENOVO on 2016/12/19.
 */
@FunctionalInterface
public interface MyInterface {

    void test();

    //    String myString();
    String toString();//可以有多个非抽象的方法 但是必须是重写Object类当中的方法，否则就会报错
}
