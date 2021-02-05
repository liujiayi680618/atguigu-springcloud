package com.atguigu.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
public class MyLogGateWay implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("***************全局过滤器--"+new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname==null){
            System.out.println("**************用户名为null，非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete(); //请求结束
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {//这是加载过滤器的顺序，一般数字越小，越是靠前
        return 0;
    }
}
