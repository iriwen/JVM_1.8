package com.jvm.classloader;

/**
 * Created by iriwen on 2018/11/3.
 */
public class MyTest4 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        System.out.println("num1 :" + Singleton.num1);
        System.out.println("num2 :" + Singleton.num2);
    }
}

class Singleton {
    //类的准备阶段会给他赋予默认值，在初始化阶段是按照代码顺序自上而下初始化的
    public static int num1;
    public static Singleton instance = new Singleton();
    private Singleton() {
        num1++;
        num2++;  //将准备阶段的num2的值（默认值）加1，后面还有初始化语句要执行

        System.out.println(Singleton.num1);
        System.out.println(Singleton.num2);
    }

    public static int num2 = 0;

    public static Singleton getInstance() {
        return instance;
    }
}