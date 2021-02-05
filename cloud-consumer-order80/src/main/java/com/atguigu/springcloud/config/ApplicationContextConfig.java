package com.atguigu.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//这个注解，消费者就可以通过服务提供者的实例名来调用服务（并赋予RestTemplate负载均衡功能）
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
