package com.atguigu.day26reflect.java2;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	/**
	 * 通过反射获取属性 （掌握）
	 * @throws Exception 
	 * @throws NoSuchFieldException 
	 * 
	 * Field studentName = clazz.getDeclaredField("studentName");
	 * studentName.setAccessible(true);
	 * studentName.set(s2, "小龙哥");
	 * clazz.getDeclaredMethod("studentPrivateTest")
	 * invoke(s2)
	 */
	@Test
	public void test() throws NoSuchFieldException, Exception{
		// 获取Person的Class实例
		Class clazz  = Student.class;
		//获取属性
		/**
		 * getFields() : 获取子类及父类中所有public所修饰的属性
		 */
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("-----------------------------------------------");
		
		/**
		 * getDeclaredFields() : 获取本类中所有的属性
		 */
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
		
		System.out.println("-------------------获取指定的属性----------------------------");
		/**
		 * getField("studentAge") : 获取指定的属性（public修饰的）
		 */
		Field studentAge = clazz.getField("studentAge");
		/**
		 * setInt(Object obj, int i) : 给属性赋值
		 * obj : 对象名（给哪个对象的该属性赋值就写那个对象的名字）
		 * i : 属性值
		 */
		//创建Student对象
		Student s = new Student();
		studentAge.setInt(s, 10);
		System.out.println(s.studentAge);
		
		//--------------------------------可以获取任意权限修饰符类型修饰的属性---------
		
		/**
		 * getDeclaredField(String name) : 可以获取任意权限修饰符类型修饰的属性
		 */
		Field studentName = clazz.getDeclaredField("studentName");
		//setAccessible(boolean flag) : 允许访问
		studentName.setAccessible(true);
		
		/**
		 * set(Object obj, Object value)
		 * obj : 对象名（给哪个对象的该属性赋值就写那个对象的名字）
		 * value : 属性值
		 */
		Student s2 = new Student();
		studentName.set(s2, "pangluo");
		s2.info();
		
	}
	
	
	/**
	 * 通过反射获取方法（掌握）
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public void test2() throws NoSuchMethodException, Exception{
		Class clazz = Student.class;
		//获取方法
		/**
		 * getMethods() : 获取本类及父类中所有的public修饰的方法
		 */
//		Method[] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		System.out.println("---------------------------------------------");
		/**
		 * getDeclaredMethods() : 获取本类中所有的方法
		 */
		Method[] methods2 = clazz.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		
		System.out.println("-------------------获取指定方法--------------------------");
		/**
		 * getMethod(String name, Class<?>... parameterTypes)
		 * name : 方法名
		 * parameterTypes : 形参的类型
		 */
		Method method = clazz.getMethod("studentPublicShow",int.class);
		/**
		 * 调用方法
		 * invoke(Object obj, Object... args)
		 * obj : 对象名（调用哪个对象的该方法就写那个对象的名字）
		 * args : 实参
		 */
		Student s = new Student();
		method.invoke(s,10);
		
		System.out.println("-------------------获取指定方法--------------------------");
		
		/**
		 * getDeclaredMethod(String name, Class<?>... parameterTypes)
		 * name : 方法名
		 * parameterTypes ： 形参的类型
		 */
		Method method2 = clazz.getDeclaredMethod("studentPrivateTest");
		//充许访问
		method2.setAccessible(true);
		//调用方法
		/**
		 * 调用方法
		 * invoke(Object obj, Object... args)
		 * obj : 对象名（调用哪个对象的该方法就写那个对象的名字）
		 * args : 实参
		 */
		Student s2 = new Student();
		method2.invoke(s2);
	}
	
	
	/**
	 * 通过反射创建对象
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public void test3() throws NoSuchMethodException, Exception{
		Class clazz = Student.class;
//		clazz.newInstance(); //必须有空参构造器而且被public修饰那么可以直接使用该方法创建对象
		//获取构造器
		/**
		 * getConstructor(Class<?>... parameterTypes)
		 * parameterTypes : 形参的类型
		 */
		Constructor constructor = clazz.getConstructor();//空参的构造器
		/**
		 * 创建对象
		 * newInstance(Object ... initargs)
		 * initargs : 实例
		 */
		Student student = (Student) constructor.newInstance();
		
		
		
	}
	
	/**
	 * 通过反射获取父类
	 */
	@Test
	public void test4(){
		Class clazz = Student.class;
		Class superclass = clazz.getSuperclass();
		System.out.println(superclass);
	}
	
	/**
	 * 通过反射获取注解
	 * @throws Exception 
	 * @throws NoSuchFieldException 
	 */
	@Test
	public void test5() throws NoSuchFieldException, Exception{
		Class clazz = Student.class;
		
		/**
		 * 获取的是类上的注解
		 */
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			//获取注解上属性的值
			MyAnn ma = (MyAnn) annotation;
			System.out.println(ma.name());
		}
		
		/**
		 * 获取属性、构造器等等上的注解
		 * 1.先获取属性，构造器
		 * 2.再获取上面的注解
		 */
		
		Field field = clazz.getField("studentAge");
		//拿注解
		Annotation[] annotations2 = field.getAnnotations();
		for (Annotation annotation : annotations2) {
			System.out.println(annotation);
		}
	}
}














