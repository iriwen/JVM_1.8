package com.h3c.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by LENOVO on 2017/1/8.
 */
public class StreamTest {

    public static void main(String[] args) {

        Person p1 = new Person(20, "hello");
        Person p2 = new Person(30, "tome");
        Person p3 = new Person(40, "zhangsan");

        List<Person> list = Arrays.asList(p1, p2, p3);

        List<Person> perList = list.stream().filter(p -> p.getAge() > 10).collect(Collectors.toList());

        //perList.forEach(item ->System.out.println(item.getName() + item.getAge()));

        StreamTest st = new StreamTest();

        //lambda表达式分为 expression  和statement  ，前者为简单的一个表达式，后者为一个程序块
        List<Person> testPersons = st.getPersonByAge(22, list, (parm1, personArr) ->
                personArr.stream().filter(p -> p.getAge() > parm1).collect(Collectors.toList())
        );
        testPersons.forEach(item -> System.out.println(item.getName() + item.getAge()));
    }

    public List<Person> filterPersons() {
        return null;
    }

    public List<Person> getPersonByAge(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> bi) {
        return bi.apply(age, persons);
    }


}
