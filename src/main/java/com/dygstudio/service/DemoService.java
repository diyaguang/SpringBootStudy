package com.dygstudio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: diyaguang
 * @date: 2017/12/26 上午9:13
 * @description: com.dygstudio.service
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }
    
    public void setAnother(String another) {
        this.another = another;
    }
}
