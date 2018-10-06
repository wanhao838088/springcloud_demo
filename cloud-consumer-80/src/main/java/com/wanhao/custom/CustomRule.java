package com.wanhao.custom;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LiuLiHao on 2018/10/6 20:45.
 * 描述： 自定义负载规则
 * 作者： LiuLiHao
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule myRule()
    {
        return new MyRule();// 我自定义为每台机器5次
    }
}
