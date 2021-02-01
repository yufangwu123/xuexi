package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * 对外接口注解
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RemoteInterface {
}
