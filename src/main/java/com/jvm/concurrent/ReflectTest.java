package com.jvm.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by LENOVO on 2017/7/3.
 */
public class ReflectTest {
    private String hell;

    public int add(int a, int b) {
        return a + b;
    }

    public String str(String name) {
        return "hello" + name;
    }

    public static void main(String[] args) throws Exception {

        Class<ReflectTest> reflectClazz = ReflectTest.class;
        ReflectTest rt = reflectClazz.newInstance();
        Method addMethod = reflectClazz.getMethod("add", new Class[]{int.class, int.class});
        Field[] field = reflectClazz.getDeclaredFields();
        field[0].getType();

        Object result = addMethod.invoke(rt, 2, 6);
        System.out.println("the result is " + result);

    }
}
