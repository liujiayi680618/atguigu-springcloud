package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * consul作为服务注册中心，服务消费者
 */

@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为服务注册中心
public class OrdeConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrdeConsulMain80.class,args);
    }
}
