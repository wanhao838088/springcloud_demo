package com.wanhao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by LiuLiHao on 2018/10/4 15:31.
 * 描述：
 * 作者： LiuLiHao
 */
@EnableEurekaClient
@SpringBootApplication
public class DeptApplication_8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptApplication_8002.class,args);
    }
}
