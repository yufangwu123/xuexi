package com.example.demo.enums;

import com.example.demo.inter.BaseInterface;
import com.example.demo.inter.YuInterface;

public enum MethodEnum {

    USERCODE("001", new YuInterface());
    private String code;

    private BaseInterface baseInterface;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BaseInterface getBaseInterface() {
        return baseInterface;
    }

    public void setBaseInterface(BaseInterface baseInterface) {
        this.baseInterface = baseInterface;
    }


    MethodEnum(String code,BaseInterface baseInterface){
        this.code =code;
        this.baseInterface =baseInterface;
    }
    public static MethodEnum valueOfCode(String code){
        for(MethodEnum methodEnum :values()){
            if(methodEnum.getCode().equals(code)){
                return methodEnum;
            }
        }
        return null;
    }
}
