package com.dygstudio.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: diyaguang
 * @date: 2017/12/26 上午10:48
 * @description: com.dygstudio.service
 */
public class JSR250WayService {

    @PostConstruct   //这个注解表示在构造函数执行之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        System.out.println("初始化构造函数 - JSR250WayService");
    }
    @PreDestroy  //这个注解表示在 Bean销毁之前执行
    public void destory(){
        System.out.println("jsr250-destory-mehod");
    }
}
