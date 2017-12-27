package com.dygstudio.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: diyaguang
 * @date: 2017/12/26 下午2:06
 * @description: com.dygstudio.event
 * 定义事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("我(Bean-demoListener) 接收到了 Bean-demoPublisher 发布的消息:"+msg);
    }
}
