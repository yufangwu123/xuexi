package com.example.demo.convert;

import com.example.demo.config.Config;
import com.example.demo.service.IUserService;
import com.example.demo.service.impl.UserServiceImpl;
import lombok.Data;

/**
 * @Description:
 * @author: yufangwu
 * @Version: 1.0
 * @CreateTime: 2021/2/3 14:30
 * @UpdateTime:
 */
public class BaseUser {


    private String userName;

    private String code;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void insert(Config config){

    }

    IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
