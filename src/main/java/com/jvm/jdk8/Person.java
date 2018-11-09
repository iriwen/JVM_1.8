package com.jvm.jdk8;
/**
 * Created by LENOVO on 2017/1/8.
 */
public class Person {

    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }
}
