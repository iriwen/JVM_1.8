package com.jvm.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by iriwen on 2018/7/21.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
    String value() default "hello";//指定枚举的默认值
    Myenum value2() ;
    String[]  value3();

}
enum  Myenum{
    Hello,World,Welcome
}
