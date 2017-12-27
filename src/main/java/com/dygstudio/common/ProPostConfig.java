package com.dygstudio.common;

import com.dygstudio.service.BeanWayService;
import com.dygstudio.service.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: diyaguang
 * @date: 2017/12/26 上午10:55
 * @description: com.dygstudio.common
 */
@Configuration
public class ProPostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
