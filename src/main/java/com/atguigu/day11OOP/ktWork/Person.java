/**
 * 
 */
package com.atguigu.day11OOP.ktWork;

/**
   * 项目名称：domo
   *类名称：Person
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月13日上午10:53:43
   * 类描述 编写一个Person类，包括属性/private（name、age），构造器、方法say(返回自我介绍的字符串）。
编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)。
编写Test类，分别创建Person和Student对象，调用say方法输出自我介绍。

 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say() {
		System.out.println("Person name = "+name+" age = "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
