package com.example.demo.inter;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDto;

public class YuInterface implements  BaseInterface {

    @Override
    public void insert(User user){
        UserDto userDto =(UserDto) user;
        System.out.print(userDto.getAge());
    }
}
