package com.jvm.classloader;

/**
 * Created by iriwen on 2018/11/4.
 */
public class MyTest5 {
    public static void main(String[] args) throws Exception {
        Class<?>  clazz = Class.forName("java.lang.String");
        //根类加载器加载可能要返回null
        System.out.println(clazz.getClassLoader());
        Class<?>  clazz2 = Class.forName("com.jvm.classloader.Cl");
        //应用类加载器
        System.out.println(clazz2.getClassLoader());
    }
}
class Cl {

}