package com.atguigu.springcloud;

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Eureka作为服务注册中心，服务消费者
 */

//这是消费者，订单模块
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration = MySelfRule.class)//调用哪个服务用自定义的负载均衡规则（这边调用的服务名要大小写要注意，不然还是默认的轮询规则）
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
