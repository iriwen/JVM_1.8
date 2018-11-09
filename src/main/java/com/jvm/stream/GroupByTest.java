package com.h3c.stream1;

import com.h3c.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by LENOVO on 2017/6/4.
 */
public class GroupByTest {

    public static void main(String[] args) {
        Student s1 = new Student(20, "zhangsan", "hangzhou");
        Student s2 = new Student(30, "lisi", "nanjing");
        Student s3 = new Student(40, "wangwu", "shanghai");
        Student s4 = new Student(26, "zhangsan", "suzhou");

        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        Map<String, List<Student>> map1 = list.stream().collect(Collectors.groupingBy(item -> item.getName()));
        System.out.println(map1);
        Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(item -> item.getName(), Collectors.counting()));
        System.out.println(map2);
    }
}
