package com.atguigu.day26reflect.java2;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionTest2 {

	/**
	 * 获取属性的详细信息
	 */
	@Test
	public void test(){
		
		Class clazz = Student.class;
		
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			
			//获取权限修饰符
			int modifiers = field.getModifiers();
			System.out.print(Modifier.toString(modifiers) + " ");
			
			//获取属性类型
			System.out.print(field.getType() + " ");
			
			//获取属性的名字
			System.out.print(field.getName());
			
			System.out.println();
		}
		
		Person person = new Person();
	}
}












