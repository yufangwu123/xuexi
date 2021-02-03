package com.example.demo.inter;

import com.example.demo.config.Config;
import com.example.demo.convert.UserBo;
import com.example.demo.convert.UserDto;

public interface BaseInterface {

     void insert(Config config);

     void insert(Config config, UserDto userDto);

     void insert(Config config, UserBo userBo);

}
