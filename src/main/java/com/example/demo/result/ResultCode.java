package com.example.demo.result;

public enum ResultCode {
    FAIL(400),
    SUCCESS(200);

    public int code;
    ResultCode(int code){this.code = code;}
}
