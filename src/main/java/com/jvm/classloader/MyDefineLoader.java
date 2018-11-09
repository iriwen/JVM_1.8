package com.jvm.classloader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author  iriwen
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
        //classname = "D:/IdeaWorkSpace/JVM_1.8/out/production/classes/com/h3c/joda/JodaTest1"+this.postFix;
        classname = classname + this.postFix;
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
        Class clazz = this.loadClass("com.h3c.joda.JodaTest1");
        return clazz;
    }

    public static void main(String[] args) throws Exception {
        MyDefineLoader classLoader = new MyDefineLoader("loader1");
        Class clazz = classLoader.test();
        System.out.println(clazz.newInstance());
    }
}
