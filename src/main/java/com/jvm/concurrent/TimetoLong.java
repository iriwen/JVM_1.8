package com.jvm.concurrent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by a0285 on 2018/7/5.
 */
public class TimetoLong {

    /**
     * @param  sourceTime 待转化的时间
     * @param  dataFormat 日期的组织形式
     * @return long 当前时间的长整型格式,如 1247771400000
     */
    private static long string2long(String sourceTime,String dataFormat){
        long longTime = 0L;
        DateFormat f = new SimpleDateFormat(dataFormat);
        Date d = null;
        try {
            d = f.parse(sourceTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        longTime = d.getTime();
        return longTime;
    }

    public static void main(String[] args) {
        //将 "2009-7-17 03:10"的形式转化成 "1247771400000" 的格式

        String dataFormat = "yyyy-MM-dd HH:mm:ss";
        long longTime = string2long("2018-06-20 02:50:00",dataFormat);
        System.out.println("2018-06-20 02:50:00" +"->"+longTime);


        /*//1261128540000->2009-12-18 17:29:00
        strTime = long2String(longTime,dataFormat);*/
    }



}
