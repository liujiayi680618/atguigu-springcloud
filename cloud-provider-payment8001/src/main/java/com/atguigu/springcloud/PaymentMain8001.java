package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 基于Eureka注册中心的服务提供者，8001
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//这个注解是开启发现服务功能（就是把自身的服务信息暴露给对方，通过DiscoveryClient这个类查询到当前微服务的各种信息）
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
