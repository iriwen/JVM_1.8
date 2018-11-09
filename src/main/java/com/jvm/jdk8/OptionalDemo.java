package com.jvm.jdk8;
import java.util.Optional;

/**
 * Created by LENOVO on 2017/3/1.
 */
public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> optionTest = Optional.of("hello");

        Optional<String> optional = Optional.empty();
        optionTest.ifPresent(item -> System.out.println(item));
        System.out.println(optionTest.orElse("cloudos"));//如果为空打印cloudos否则打印optional容器包含的内容

        System.out.println(optional.orElseGet(() -> "test exercise !"));
        //Your copy is licensed to lan yu
    }


}
