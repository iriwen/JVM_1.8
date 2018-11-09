package com.jvm.classloader;

import java.util.UUID;

/**
 * 对于数组实例来说，其类型是由jvm动态生成的
 */
public class MyTest3 {
    public static void main(String[] args) {
        /*
        //不会造成类的初始化,会由jvm在运行期间，动态生成一个类型
            [Lcom.jvm.classloader.MyPrent,父类就是Object
         */
        MyPrent[]  parents = new MyPrent[1];
        System.out.println(parents.getClass());
        System.out.println(MyPrent.str);
        int[]  ints = new int[2];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }
}
class  MyPrent {
    //编译期间不能确定str的值，所有调用时候需要初始化MyParent类，staic代码块会被执行
    //这时候在程序运行时会造成主动使用MyParent这个类，因为会将其初始化
    public  static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("my static block !");
    }


}
