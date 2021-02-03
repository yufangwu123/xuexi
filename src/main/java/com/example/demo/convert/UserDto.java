package com.example.demo.convert;

import com.example.demo.config.Config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
public class UserDto extends  AbstractUser{

    private String age;


    @Override
    public void insert(Config config){
        super.insert(config,this);
    }
}
