package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.annotation.RemoteInterface;
import com.example.demo.config.Config;
import com.example.demo.convert.BaseUser;
import com.example.demo.entity.User;
import com.example.demo.convert.UserDto;
import com.example.demo.enums.EntityEnum;
import com.example.demo.remote.RemoteUtil;
import com.example.demo.result.ResultMap;
import com.example.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yufangwu
 * @since 2020-07-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 登录功能
     *
     * @return
     */
    @RequestMapping("login")
    public Map login(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", user.getUserName()).eq("pass_word", user.getPassWord());
        User one = userService.getOne(wrapper);
        return one != null ? ResultMap.buildSuccessResult("登录成功") : ResultMap.buildFailResult("用户名或密码错误");
    }

    /**
     * 添加
     *
     * @return
     */
    @RequestMapping("insert")
    public Map insert(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", user.getUserName());
        User one = userService.getOne(wrapper);
        if (one != null) {
            return ResultMap.buildFailResult("该用户名已存在");
        }
        boolean save = userService.save(user);
        return save ? ResultMap.buildSuccessResult("添加用户成功") : ResultMap.buildFailResult("添加用户失败");

    }

    @RequestMapping("insertTwo")
    @RemoteInterface
    public void insertTwo(BaseUser baseUser){
        Config config =new Config();
//        JSONObject jsonObject = JSON.parseObject(userStr);
//        EntityEnum entityEnum =EntityEnum.valueOfCode(jsonObject.getString("code"));
//        BaseUser baseUser = JSON.parseObject(userStr,entityEnum.getBaseUser().getClass());
        RemoteUtil.setConfig(config);
        baseUser.insert();
        User user =new User();
        BeanUtils.copyProperties(baseUser,user);
        userService.save(user);
    }
    /**
     * 删除
     *
     * @return
     */
    @RequestMapping("delete")
    public Map delete(@RequestBody User user) {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("user_name", user.getUserName());
        boolean delete = userService.remove(wrapper);  //想通过用户名去删除
        return delete ? ResultMap.buildSuccessResult("删除用户成功") : ResultMap.buildFailResult("删除用户失败");
    }

    /**
     * 修改
     *
     * @return
     */
    @RequestMapping("update")
    public Map update(@RequestBody User user) {
        boolean update = userService.updateById(user);
        return update ? ResultMap.buildSuccessResult("更新密码成功") : ResultMap.buildFailResult("更新密码失败");
    }

    /**
     * 分页查询界面
     *
     * @return
     */
    @RequestMapping("findByPage")
    public List<User> findByPage(int pages) {
        Page<User> page = new Page<>(pages, 5);  //假设每页显示五个用户
        IPage<User> userIPage = userService.page(page);
        List<User> records = userIPage.getRecords();
        records.forEach(System.out::println);
        return records;
    }
}
