package com.atguigu.day24Thread.ObjectIO;

import java.io.Serializable;

/**
 * 
 * 序列化 ：将内存中的对象写入到磁盘上
 * 反序列化　：将磁盘上的内容再读取到内存中
 * 
 * 说明：
 * 	  1.一个类的对象如果要实现序列化，那么该对象所在的类必须实现Serializable接口
 *	  2.提供一个serialVersionUID
 *	  3.需要序列化的对象所在类中的属性（引用数据类型）也都必须实现Serializable接口
 *
 * 需求 ：一个类中的某些字段不想序列化？ 使用transient修饰的属性不会被序列化
 */
public class Person implements Serializable {

	/**
	 * 可以不显示定义serialVersionUID，系统会自增添加一个，但是建议显示提供一个。
	 * 
	 * 当系统默认提供一个serialVersionUID的时候要注意 : 如果类中的内容发生改变，那么系统将重新分配一个新的版本号。
	 * 当反序列化的时候，会把序列化到磁盘上的内容的版本和类上的版本重新对比，如果一致反序列化成功，如果不一致反序列化失败。
	 */
	private static final long serialVersionUID = -6196808149055699439L;
	
	
	String name;
	transient int age;//使用transient修饰的属性不会被序列化
	Address address;
	//增加一个属性
//	int score;
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
