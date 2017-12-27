package com.dygstudio.conditional;

/**
 * @author: diyaguang
 * @date: 2017/12/27 上午10:22
 * @description: com.dygstudio.conditional
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd(){
        return "ls";
    }
}
