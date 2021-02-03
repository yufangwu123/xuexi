package com.example.demo.convert;

import com.example.demo.config.Config;
import com.example.demo.entity.User;
import com.example.demo.inter.BaseInterface;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: yufangwu
 * @Version: 1.0
 * @CreateTime: 2021/2/2 16:20
 * @UpdateTime:
 */

public  abstract class AbstractUser extends BaseUser implements BaseInterface  {

    @Override
    public void insert(Config config,UserDto userDto){
        User user =new User();
        BeanUtils.copyProperties(userDto,user);
        userService.save(user);
        System.out.println("yufangwu");

    }


    @Override
    public void insert(Config config,UserBo userBo){
        User user =new User();
        BeanUtils.copyProperties(userBo,user);
        userService.save(user);
        System.out.println("fangwu");
    }

}