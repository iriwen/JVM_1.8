package com.h3c.joda;

/**
 * Created by a0285 on 2018/11/9.
 */
public class ArrayClassLoader {
    public static void main(String[] args) {
        String[] strings  = {"asd","sds"};
        //数组的类加载器其实和数组中的元素的类加载器是一致的，数组的元素是String，其类加载器就是bootstrap
        //在hotspot虚拟机的实现中bootstrap类加载器就是null表示的
        System.out.println();strings.getClass().getClassLoader();
        System.out.println("---------------------");

        int[] ints = new int[2];
        //返回null，原生类型的数组类对象是没有类加载器的，和上面的null含义不一样
        System.out.println(ints.getClass().getClassLoader());
    }

}
