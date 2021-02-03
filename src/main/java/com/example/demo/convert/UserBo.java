package com.example.demo.convert;

import com.example.demo.remote.RemoteUtil;
import lombok.Data;

/**
 * @Description:
 * @author: yufangwu
 * @Version: 1.0
 * @CreateTime: 2021/2/3 14:18
 * @UpdateTime:
 */
@Data
public class UserBo extends BaseUser {

    private String sex;

    @Override
    public void insert(){
        RemoteUtil.insert(this);
    }


}
