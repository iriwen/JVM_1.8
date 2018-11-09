package com.h3c.enumTest;

/**
 * Created by a0285 on 2018/7/23.
 */
public enum EnumTest {

    BLUE("blue"), RED("red"),PINK("pink");


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    EnumTest(String value){
        this.value = value;
    }

}
