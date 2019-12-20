package com.yifei.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //开启定时任务
@SpringBootApplication
@MapperScan("com.yifei.demo.dao") // 自动扫描包
public class DemoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class, args);
    }

}
