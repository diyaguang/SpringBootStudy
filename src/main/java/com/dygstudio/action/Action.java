package com.dygstudio.action;

import java.lang.annotation.*;

/***
 * 在这里编写注解
 */

/**
 * @author: diyaguang
 * @date: 2017/12/25 上午10:09
 * @description: com.dygstudio.action
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
