package com.h3c.enumTest;

/**
 * Created by a0285 on 2018/7/23.
 */
public class UsageEnum {

    public static void main(String[] args) {
        System.out.println(EnumTest.BLUE.getValue());


        if("blue".equals(EnumTest.BLUE.getValue())){
            System.out.println("color is blue");
        }
    }

}
