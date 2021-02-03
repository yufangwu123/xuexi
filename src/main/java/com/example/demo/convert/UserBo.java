package com.example.demo.convert;

import com.example.demo.config.Config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: KuangJinMing
 * @Version: 1.0
 * @CreateTime: 2021/2/3 14:18
 * @UpdateTime:
 */
@Data
public class UserBo extends AbstractUser {

    private String sex;

    @Override
    public void insert(Config config){
        super.insert(config,this);
    }
}
