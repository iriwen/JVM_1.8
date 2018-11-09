package com.h3c.jdk8;

import java.util.function.Function;

/**
 * Created by LENOVO on 2017/1/7.
 */
public class StringComparator {
    public static void main(String[] args) {
        StringComparator sc = new StringComparator();
        String number = sc.compute(5, value -> String.valueOf(5 + value));
        System.out.println(number);
    }

    public String compute(int a, Function<Integer, String> function) {

        return function.apply(a);
    }

}
