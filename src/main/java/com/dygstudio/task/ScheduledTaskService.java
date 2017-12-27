package com.dygstudio.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: diyaguang
 * @date: 2017/12/27 上午9:41
 * @description: com.dygstudio.task
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒，执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 55 9 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+dateFormat.format(new Date())+" 执行");
    }
}
