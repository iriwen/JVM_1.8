package com.h3c.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by LENOVO on 2017/6/4.
 */
public class StreamGroup1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "nihao");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");

//        list1.stream().forEach(item->{
//            list2.forEach(item2->{
//                System.out.println(item +" : "+ item2);
//            });
//        });
        List<String> result = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).
                collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
