package com.h3c.joda;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by a0285 on 2018/11/9.
 */
public class MyDefineLoader extends ClassLoader {

    //加载类
    private String loaderName;
    private final String postFix = ".class";

    public MyDefineLoader(String loaderName) {
        super(); //将系统类加载器作为该类的父加载器
        this.loaderName = loaderName;
    }

    public MyDefineLoader(ClassLoader parent, String loaderName) {
        super(parent);//将指定的类加载器作为该类的父加载器
        this.loaderName = loaderName;
    }

    @Override
    public Class findClass(String classname) {

        byte[] b = loadClassData(classname);

        return defineClass(classname, b, 0, b.length);
    }

    public byte[] loadClassData(String classname) {
       // classname = classname.replace(".","/") + this.postFix;
        classname = "D:/idea-workspace/code8/build/classes/main/com/h3c/joda/JodaTest1"+this.postFix;
        byte[] data = null;
        InputStream is;
        try {
            is = new FileInputStream(new File(classname));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int index ;
            while (-1 != (index = is.read())) {
                baos.write(index);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }


    public Class test() throws Exception {

        //D:\idea-workspace\code8\build\classes\main\com\h3c\joda

        Class clazz = this.loadClass("com.h3c.joda.JodaTest1.class");
        return clazz;
    }

    public static void main(String[] args) throws Exception {
        //D:\idea-workspace\code8\build\classes\main\
        MyDefineLoader classLoader = new MyDefineLoader("loader1");
        Class clazz = classLoader.test();
        System.out.println(clazz.newInstance());
    }
}
