package com.wanhao.custom;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/10/6 20:46.
 * 描述：
 * 作者： LiuLiHao
 */
public class MyRule extends AbstractLoadBalancerRule {
    private int total = 0; 			// 总共被调用的次数，目前要求每台被调用5次
    private int currentIndex = 0;	// 当前提供服务的机器号


    public Server choose(ILoadBalancer lb, Object key) {
        List<Server> allServers = lb.getAllServers();
        List<Server> reachableServers = lb.getReachableServers();

        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }
            if (total < 5) {
                server = upList.get(currentIndex);
                total++;
            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }
            }


            if (server == null) {
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            server = null;
            Thread.yield();
        }

        return server;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }


}
