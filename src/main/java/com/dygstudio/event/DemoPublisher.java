package com.dygstudio.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author: diyaguang
 * @date: 2017/12/26 下午2:10
 * @description: com.dygstudio.event
 * 事件发布类
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
