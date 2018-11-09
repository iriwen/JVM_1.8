package com.jvm.classloader;

/**
 * Created by iriwen on 2018/11/4.
 */
public class MyTest6 {

    public static  int  a = 6;
    static{
        System.out.println("static  block");
    }

    public static void main(String[] args) {
        ClassLoader  loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        while(null != loader){
            loader = loader.getParent();
            System.out.println(loader);
        }
    }
}
class  MyParent{

}
class  MyChild  extends  MyPrent{

}
