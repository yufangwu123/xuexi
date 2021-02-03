package com.example.demo.Handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.annotation.RemoteInterface;
import com.example.demo.enums.EntityEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 对外接口注解处理器
 */
@Aspect
@Slf4j
@Component
public class RemoteInterfaceHandle {
    @Resource
    private HttpServletRequest request;

    @Around("execution(* com.example.demo.controller.*.*(..))")
    public Object thirdProcess(ProceedingJoinPoint joinPoint) throws Throwable {

        // 反射处理注解
        Object[] args = joinPoint.getArgs();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Class<?>[] methodParameterTypes = methodSignature.getParameterTypes();
        Class<?> controllerClass = joinPoint.getTarget().getClass();
        Method method = methodSignature.getMethod();
        Annotation methodAnnotation = method.getAnnotation(RemoteInterface.class);
        if ( methodAnnotation != null) {
            // 需要校验参数
            // 校验请求参数
            String reqData = this.validationReq();
            // 注入调用方法参数
            // 1. 获取调用方法上的参数列表注解
            JSONObject jsonObject =JSON.parseObject(reqData);
            EntityEnum entityEnum = EntityEnum.valueOfCode(jsonObject.getString("code"));
            args[0] = JSON.parseObject(reqData, entityEnum.getBaseUser().getClass());
        }
        return joinPoint.proceed(args);
    }

    private String validationReq() throws IOException {
        InputStream in = request.getInputStream();
        // 获取请求的内容
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            sb.append(s);
        }
        return sb.toString();
    }
}
