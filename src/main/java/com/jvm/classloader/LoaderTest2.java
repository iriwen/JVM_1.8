package com.h3c.joda;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created by a0285 on 2018/11/9.
 */
class Cl {
    static {
        System.out.println("Class  Cl");
    }
}
//调用Classloader的loadclass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
public class LoaderTest2 {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz = classLoader.loadClass("com.h3c.joda.Cl");
        System.out.println(clazz);

        System.out.println("--------------------");
        Class<?> clazz2 = Class.forName("com.h3c.joda.Cl");
        System.out.println(clazz2 + "**********");

        printClassLoader();

    }


    public static void printClassLoader() throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        while(null != classLoader){

            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }

        ClassLoader  classLoader2 = Thread.currentThread().getContextClassLoader();

        String resourceName = "com/h3c/joda/JodaTest1.class";
        //获取给定名字的所有资源 包括音频图片文本等
        Enumeration<URL>   urls   = classLoader2.getResources(resourceName);
        while(urls.hasMoreElements()){
            URL url =   urls.nextElement();

            System.out.println(url);
        }

        Class  strClass  = String.class;
        //默认是启动类加载器  即bootStrap (程序里面返回是null)
        System.out.println(strClass.getClassLoader());

        Class appClass = LoaderTest2.class;
        //是应用类加载器，默认是appclassLoader
        System.out.println(appClass.getClassLoader());
    }
}
