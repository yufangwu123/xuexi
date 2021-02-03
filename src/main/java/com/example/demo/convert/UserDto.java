package com.example.demo.convert;

import com.example.demo.remote.RemoteUtil;
import lombok.Data;


@Data
public class UserDto extends  BaseUser{

    private String age;


    @Override
    public void insert(){
        RemoteUtil.insert(this);
    }
}
