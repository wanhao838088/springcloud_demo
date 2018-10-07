package com.wanhao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by LiuLiHao on 2018/10/4 16:08.
 * 描述：
 * 作者： LiuLiHao
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.wanhao.cloud"})
@ComponentScan("com.wanhao.cloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }

}
