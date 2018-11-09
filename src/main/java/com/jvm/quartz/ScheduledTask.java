package com.cloudos.kafka.quartz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by a0285 on 2018/7/6.
 */


@Component
@Configurable
@EnableScheduling
public class ScheduledTask {

    /*//每1分钟执行一次
    @Scheduled(cron = "0 *//*1 *  * * * ")
    public void attachMonitorData() {
        System.out.println("Scheduling Tasks By Cron: now is " + dateFormat().format(new Date()));
    }

    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime() {
        System.out.println("Scheduling Tasks : now is" + dateFormat().format(new Date()));
    }

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }*/
}

