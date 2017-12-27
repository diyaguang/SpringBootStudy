package com.dygstudio.service;

import com.dygstudio.action.Action;
import org.springframework.stereotype.Service;


/**
 * @author: diyaguang
 * @date: 2017/12/25 上午10:26
 * @description: com.dygstudio.service
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
