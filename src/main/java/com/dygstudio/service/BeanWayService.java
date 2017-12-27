package com.dygstudio.service;

/**
 * @author: diyaguang
 * @date: 2017/12/26 上午10:45
 * @description: com.dygstudio.service
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数 - BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
