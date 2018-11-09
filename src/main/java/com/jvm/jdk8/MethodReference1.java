package com.h3c.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by LENOVO on 2017/3/12.
 */
public class MethodReference1 {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjing", "shanghai");
        //Collections.sort(cities,(city1,city2)->city1.compareToIgnoreCase(city2));
        Collections.sort(cities, String::compareToIgnoreCase);
        //方法引用其实相当于a.xxxx(b)，满足条件：接受两个参数其中第一个参数是调用者自身，第二个参数就是b（）
        // 这样就可以简写成类名：：实例方法名的形式
        cities.forEach(item -> System.out.println("" + item));

        //cities.stream().forEach(item ->item.toUpperCase()).colle;


    }
}
