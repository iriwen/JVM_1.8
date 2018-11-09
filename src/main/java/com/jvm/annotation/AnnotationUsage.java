package com.jvm.annotation;

/**
 * Created by iriwen on 2018/7/21.
 * 定义在java.lang包里面的类不需要导入
 */
@Annotation(value2 =Myenum.Hello, value3={"sd","sasd","3213"})
public class AnnotationUsage {

    @Annotation(value2 =Myenum.Hello,value3={"df","32dss13"})
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output(){
        System.out.println("sdsdsd");
    }


}
