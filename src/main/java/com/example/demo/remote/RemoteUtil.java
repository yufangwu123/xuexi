package com.example.demo.remote;

import com.example.demo.config.Config;
import com.example.demo.convert.UserBo;
import com.example.demo.convert.UserDto;
import com.example.demo.inter.BaseInterface;

/**
 * @Description:
 * @author: yufangwu
 * @Version: 1.0
 * @CreateTime: 2021/2/3 16:20
 * @UpdateTime:
 */
public  class RemoteUtil implements BaseInterface {

    private static Config config;

    public Config getConfig() {
        return config;
    }

    public static void  setConfig(Config configOne) {
        config = configOne;
    }

    @Override
    public void insert(UserDto userDto){
        System.out.println("yufangwu");
    }


    @Override
    public  void insert(UserBo userBo){
        System.out.println("fangwu");

    }

}
