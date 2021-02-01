package com.example.demo.enums;

import com.example.demo.entity.UserDto;

public enum EntityEmum {

    USERCDOE("001", UserDto.class);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    private String code;

    private Class aClass;
    EntityEmum(String code,Class aClass){
        this.code =code;
        this.aClass =aClass;
    }

    public static EntityEmum valueOfCode(String code){
        for(EntityEmum entityEmum :values()){
            if(entityEmum.getCode().equals(code)){
                return entityEmum;
            }
        }
        return null;
    }
}
