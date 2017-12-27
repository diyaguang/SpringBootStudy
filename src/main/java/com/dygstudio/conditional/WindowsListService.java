package com.dygstudio.conditional;

import org.springframework.stereotype.Service;

/**
 * @author: diyaguang
 * @date: 2017/12/27 上午10:20
 * @description: com.dygstudio.conditional
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd(){
        return "dir";
    }
}
