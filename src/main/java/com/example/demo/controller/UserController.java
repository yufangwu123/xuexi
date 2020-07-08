package com.example.demo.controller;


import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yufangwu
 * @since 2020-07-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    /**
     * 登录功能
     * @return
     */
    @RequestMapping("login")
    public Map login(){

       return null;

    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("insert")
    public Map insert(){

        return null;
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("delete")
    public Map delete(String id ){
        Boolean delete =userService.removeById(id);
        return null;
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping("update")
    public Map update(){
        return null;

    }

    /**
     * 分页查询界面
     * @return
     */
    @RequestMapping("findByPage")
    public Map findByPage(){

        return null;
    }
}
