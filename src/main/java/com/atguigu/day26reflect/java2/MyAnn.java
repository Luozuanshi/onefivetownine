package com.atguigu.day26reflect.java2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //只要通过反射获取注解，那么该注解的生命周期必须为RUNTIME
public @interface MyAnn {
	String name() default "ccc";
}
