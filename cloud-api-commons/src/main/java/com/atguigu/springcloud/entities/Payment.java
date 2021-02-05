package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//lombok一套带走
@Data               //这个注解不需要写getter和setter
@AllArgsConstructor //这个注入形参
@NoArgsConstructor  //这个注入空参
public class Payment implements Serializable {//implements Serializable 序列化，后分布式部署用得到
    private Long id;
    private String serial;

}
