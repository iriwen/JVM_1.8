package com.jvm.concurrent;

import java.util.Timer;
import java.util.TimerTask;

//递归得实现每隔两秒输出bombling，通常有个定时任务的工具quartz可以使用
public class RecursiveTimer {
    public static void main(String[] args) {

        class MyTimerTask1 extends TimerTask {
            @Override
            public void run() {
                System.out.println("bombling ... ");
                new Timer().schedule(new MyTimerTask1(), 2000);
            }
        }

        new Timer().schedule(new MyTimerTask1(), 2000);
    }
}

