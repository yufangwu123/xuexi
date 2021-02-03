package com.example.demo.enums;

import com.example.demo.convert.BaseUser;
import com.example.demo.convert.UserBo;
import com.example.demo.convert.UserDto;

public enum EntityEnum {

    USERCDOE("001", new UserDto()),

    YUFANGWU("002",new UserBo());

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BaseUser getBaseUser() {
        return baseUser;
    }

    public void setBaseUser(BaseUser baseUser) {
        this.baseUser = baseUser;
    }

    private String code;

    private BaseUser baseUser;


    EntityEnum(String code, BaseUser baseUser){
        this.code =code;
        this.baseUser =baseUser;
    }

    public static EntityEnum valueOfCode(String code){
        for(EntityEnum entityEnum :values()){
            if(entityEnum.getCode().equals(code)){
                return entityEnum;
            }
        }
        return null;
    }
}
