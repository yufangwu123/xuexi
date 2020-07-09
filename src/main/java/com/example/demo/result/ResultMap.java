package com.example.demo.result;

import java.util.HashMap;
import java.util.Map;

public class ResultMap {
    public static Map buildSuccessResult(String message, Object data) {
        return buildResult(ResultCode.SUCCESS, message, data);
    }

    public static Map buildSuccessResult(String message) {
        return buildResult(ResultCode.SUCCESS, message, null);
    }

    public static Map buildFailResult(String message) {
        return buildResult(ResultCode.FAIL, message, null);
    }

    public static Map buildResult(ResultCode resultCode, String message, Object data) {
        return buildResult(resultCode.code, message, data);
    }

    public static Map buildResult(int resultCode, String message, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", resultCode);
        map.put("message", message);
        map.put("data", data);
        return map;
    }
}
