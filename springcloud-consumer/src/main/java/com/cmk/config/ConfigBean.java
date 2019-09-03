package com.cmk.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther changmk
 * @date 2019/8/8 下午11:00
 */

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   // 客户端 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RandomRule();//覆盖默认（轮询）的负载均衡算法
    }

}
