package com.jvm.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by LENOVO on 2016/12/19.
 */
public class Test1 {

    public static void main(String[] args) {

        // System.out.printf("hello world");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(i);
        }

        for (Integer ins : list) {
            //System.out.println(ins + " hello ");
        }
        list.forEach(System.out::println);//方法引用的形式生成函数式接口的实例
        System.out.println("java 8 ");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

}
