package com.jvm.classloader;

/**
 * Created by iriwen on 2018/11/1.
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(Const.s);
    }
}

class  Const {
    public static final  String test = "test";
    public static final  short  s  = 127;
    public static final  int  i = 128;
    public static final  int  m = 1;
}
