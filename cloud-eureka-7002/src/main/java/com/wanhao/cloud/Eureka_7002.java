package com.wanhao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by LiuLiHao on 2018/10/6 14:18.
 * 描述：
 * 作者： LiuLiHao
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka_7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7002.class,args);
    }

}
