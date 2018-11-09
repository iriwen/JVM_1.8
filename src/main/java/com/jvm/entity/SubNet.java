package com.jvm.entity;

/**
 * Created by LENOVO on 2017/6/11.
 */
public class SubNet extends H3CNet {
    public static void main(String[] args) {

        H3CNet hnet = new SubNet();
        System.out.println(hnet instanceof H3CNet);
    }
}
