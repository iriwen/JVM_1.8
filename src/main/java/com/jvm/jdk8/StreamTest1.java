package com.jvm.jdk8;

/**
 * Created by LENOVO on 2016/12/29.
 */
public class StreamTest1 {

    TheStream ts = () -> {
        System.out.println("hello");
    };
}


interface TheStream {
    void myMthod();
}