package com.example.demo.convert;

import com.example.demo.config.Config;

/**
 * @Description:
 * @author: KuangJinMing
 * @Version: 1.0
 * @CreateTime: 2021/2/3 14:18
 * @UpdateTime:
 */
public class UserBo extends AbstractUser {

    private String sex;

    @Override
    public void insert(Config config){
        super.insert(config,this);
    }
}
