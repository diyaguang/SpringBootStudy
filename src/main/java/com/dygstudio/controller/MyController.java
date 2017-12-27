package com.dygstudio.controller;

import com.dygstudio.common.ElConfig;
import com.dygstudio.common.ProPostConfig;
import com.dygstudio.conditional.ListService;
import com.dygstudio.event.DemoPublisher;
import com.dygstudio.service.DemoAnnotationService;
import com.dygstudio.service.DemoMethodService;
import com.dygstudio.service.DemoService;
import com.dygstudio.service.JSR250WayService;
import com.dygstudio.task.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: diyaguang
 * @date: 2017/11/22 上午11:00
 * @description: com.dygstudio.controller
 */
@Controller
@RequestMapping("/demo")
public class MyController {

    @Autowired
    DemoAnnotationService demoAnnotationService;
    @Autowired
    DemoMethodService demoMethodService;
    //@Autowired
    //ElConfig elConfig;
    @Autowired
    DemoService demoService;
    @Autowired
    JSR250WayService jsr250WayService;

    @Autowired
    DemoPublisher demoPublisher;

    @Autowired
    AsyncTaskService asyncTaskService;

    @Autowired
    ListService listService;

    @RequestMapping("/welcome")
    public String welcome(){
        demoAnnotationService.add();
        demoMethodService.add();
        return "welcome";
    }

    @RequestMapping("/elConfig")
    public String elTest(){
        //elConfig.outputResource();
        return "welcome";
    }

    @RequestMapping("/event")
    public String testEvent(){
        demoPublisher.publish("这里测试消息传递");
        return "welcome";
    }

    @RequestMapping("/thread")
    public String testThread(){
        for (int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        return "welcome";
    }

    @RequestMapping("/condition")
    public String testCondition(){
        System.out.println(listService.showListCmd());
        return "welcome";
    }
}
