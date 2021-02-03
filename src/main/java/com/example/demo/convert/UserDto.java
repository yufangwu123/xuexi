package com.example.demo.convert;

import com.example.demo.config.Config;
import lombok.Data;

@Data
public class UserDto extends  AbstractUser{

    private String age;


    @Override
    public void insert(Config config){
        super.insert(config,this);
    }
}
