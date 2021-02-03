//package com.example.demo.enums;
//
//import com.example.demo.inter.BaseInterface;
//import com.example.demo.inter.YuInterface;
//
//public enum MethodEnum {
//
//    USERCODE("001", new UserDtoInsert());
//    private String code;
//
//    private InsertInterface insertInterface;
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public InsertInterface getInsertInterface() {
//        return insertInterface;
//    }
//
//    public void setInsertInterface(InsertInterface insertInterface) {
//        this.insertInterface = insertInterface;
//    }
//
//    MethodEnum(String code, InsertInterface insertInterface){
//        this.code =code;
//        this.insertInterface =insertInterface;
//    }
//    public static MethodEnum valueOfCode(String code){
//        for(MethodEnum methodEnum :values()){
//            if(methodEnum.getCode().equals(code)){
//                return methodEnum;
//            }
//        }
//        return null;
//    }
//}
