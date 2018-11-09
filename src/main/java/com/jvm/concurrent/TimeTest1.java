package com.jvm.concurrent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by LENOVO on 2017/6/25.
 */
public class TimeTest1 {
    public static void main(String[] args) {
        long myTime = 1529463000000L;
        DateTime dateTime2 = new DateTime(myTime,DateTimeZone.UTC) ;


        DateTime now1 = DateTime.now().withZone(DateTimeZone.UTC);
        DateTime now2 = DateTime.now().withZone(DateTimeZone.UTC);

        now1.isAfter(now2);


        //数据存在influxdb中是以utc时间存储的，即0时区时间，
        String rcf3339Date = "2018-07-16T13:10:00Z" ;
        DateTime time1  = new DateTime(rcf3339Date);

        DateTime lastReadUtc  = new DateTime(rcf3339Date).withZone(DateTimeZone.UTC);

        DateTime nowUTC = DateTime.now().withZone(DateTimeZone.UTC);

        System.out.println(Minutes.minutesBetween(nowUTC, lastReadUtc).getMinutes() + " 分钟 ");

        String queryCondition = lastReadUtc.toCalendar(Locale.getDefault()).getTimeInMillis()+"000000";

        /*DateFormat sdfc = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



        String current= sdfc.format(new Date());

        DateTime  currentTime  = new DateTime(current);*/



        //String  rcf3339Date = "2018-07-05T02:15:44.892038644Z";


       // DateTime  now = DateTime.now();


        //DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

        //时间解析
        //DateTime theFormatDate = DateTime.parse(now.toString(),format);

        //System.out.println(theFormatDate);

        //System.out.println(Minutes.minutesBetween(nowLocal, dateTime).getMinutes() + " 分钟 ");

        //System.out.print(Minutes.minutesBetween(now, dateTime).getMinutes() % 60 + " 分钟 ");

        //Long result  =  dateTime.toCalendar(Locale.getDefault()).getTimeInMillis();



        //String queryCondition = dateTime.toCalendar(Locale.getDefault()).getTimeInMillis()+"000000";


          //double db = Double.valueOf(queryCondition);

        //System.out.println("result :" + result + ";" + "time long value :" + queryCondition);








        /*1530756411920726728 对应  2018-07-05T02:06:51.920726728Z*/
       // DateTime  plusOneMinute = dateTime.plusMinutes(1);

        //long plusOneMinuteLong = plusOneMinute.toCalendar(Locale.getDefault()).getTimeInMillis();

        //System.out.println(plusOneMinute  + ": " + plusOneMinuteLong);
        //dateTime.toCalendar()

        //1529463000000

        //"2018-06-20T02:51:00Z" ;
        long time =1529463000000L ;
        DateTime dateTime3 = new DateTime(time,DateTimeZone.UTC) ;
        System.out.println(dateTime3);
        //Long result  =  dateTime.tocalendar(Locale.getDefault()).getTimeMillis();

       /* new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("bombling .....");
            }
        }, 1000);

        System.out.println("end " + new Date().getSeconds());*/
    }
}
