package com.dygstudio.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: diyaguang
 * @date: 2017/12/26 下午1:52
 * @description: com.dygstudio.event
 * 自定义事件体
 */

public class DemoEvent extends ApplicationEvent {
    private String msg;
    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }
    public String getMsg(){return msg;}
    public void setMsg(String msg){this.msg=msg;}
}

