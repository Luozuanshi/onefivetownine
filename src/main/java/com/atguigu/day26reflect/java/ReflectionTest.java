package com.atguigu.day26reflect.java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		
		
		Person person = new Person();
	
		//通过反射获取私有的属性和方法
		
		Class  clazz = person.getClass();
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		field.set(person, "小龙哥"); //给私有的属性赋上内容了
		
		person.show();
		
		
		//调用私有的方法
		Class clazz2 = person.getClass();
		Method method = clazz2.getDeclaredMethod("say");
		method.setAccessible(true);
		method.invoke(person);//调用了私有方法
		
	}
}
