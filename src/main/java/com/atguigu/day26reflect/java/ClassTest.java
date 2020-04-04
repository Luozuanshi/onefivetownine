package com.atguigu.day26reflect.java;

import org.junit.Test;

public class ClassTest {

	
	/**
	 * Class的说明：
	 * 
	 * 1.Class是反射的源头。
	 * 2.加载到JVM中的字节码的文件都是Class的实例。
	 * 3.加载到JVM中的字节码文件所对应的类叫作运行时类。（比如:Person）
	 * 		  那么加载到JVM中的字节码文件也叫作运行时类的对象。
	 *  4.Class本身也是一个类
		5.Class 对象只能由系统建立对象
		6.一个加载的类在 JVM 中只会有一个Class实例 
		7.一个Class对象对应的是一个加载到JVM中的一个.class文件
		8.每个类的实例都会记得自己是由哪个 Class 实例所生成
		9.通过Class可以完整地得到一个类中的所有被加载的结构 
		10.Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象
	 * @throws Exception 

	 */
	@Test
	public void test() throws Exception{
		Person p = new Person();
		//获取Class实例的方式：
		
		//1.类名.class （必须会）
		Class clazz = Person.class;
		//2.对象名.getClass()（必须会）
		Class clazz2 = p.getClass();
		//3.通过Class.forName(全类名)（必须会）
		Class clazz3 = Class.forName("atguigu.day26reflect.java.Person");
		//4.类加载器 : 类加载器.loadClass(全类名)
		ClassLoader classLoader = this.getClass().getClassLoader();//获取类加载器
		Class clazz4 = classLoader.loadClass("src.main.java.com.atguigu.day26reflect.java.Person");
	}
}

















