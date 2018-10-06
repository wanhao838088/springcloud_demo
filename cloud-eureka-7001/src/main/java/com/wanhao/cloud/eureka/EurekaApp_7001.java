package com.wanhao.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by LiuLiHao on 2018/10/4 20:03.
 * 描述：
 * 作者： LiuLiHao
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp_7001.class,args);
    }
}
