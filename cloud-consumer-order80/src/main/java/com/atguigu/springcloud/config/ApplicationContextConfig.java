package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //这个是在controller配置eureka的服务名代替具体的域名之后启用负载均衡避免报错的
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
