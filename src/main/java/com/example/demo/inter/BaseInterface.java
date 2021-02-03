package com.example.demo.inter;

import com.example.demo.config.Config;
import com.example.demo.convert.UserBo;
import com.example.demo.convert.UserDto;

public interface BaseInterface {

     void  insert(UserDto userDto);

     void insert(UserBo userBo);

}
