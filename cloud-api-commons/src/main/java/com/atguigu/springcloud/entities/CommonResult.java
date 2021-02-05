package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok一套带走
@Data               //这个注解不需要写getter和setter
@AllArgsConstructor //这个注入形参
@NoArgsConstructor  //这个注入空参
public class CommonResult<T> {
    private Integer code;   //状态码
    private String message; //给前端的提示信息
    private T data;         //传给前端的数据

    public CommonResult(Integer code, String message){//这是有可能没有返回给前端的参数，data为null
        this(code,message,null);
    }
}
