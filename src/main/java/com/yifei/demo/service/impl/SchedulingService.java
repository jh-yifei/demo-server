package com.yifei.demo.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 定时任务业务类
 */
@Service
public class SchedulingService {

//    @Scheduled(cron = "0/3 * * * * *")
    public void sayHello(){
        System.out.println("Hello World");
    }
}
