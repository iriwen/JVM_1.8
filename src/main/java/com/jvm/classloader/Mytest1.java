package com.jvm.classloader;

/**
 * Created by iriwen on 2018/11/1.
 */
public class Mytest1 {
    public static void main(String[] args) {
        //System.out.println(Child.str);
        System.out.println(Child.str2);

    }
}


class Parent {

    public static String str = "parentStatic";
    //public static final String str = "parentStatic";
    static {
        System.out.println("parent static block ");
    }
}
class  Child extends Parent {
    public static String str2 = "childStatic";
    static {
        System.out.println("child static block ");
    }
}