/**
 * 
 */
package com.atguigu.day11OOP.route;

public class Animal {
	public String name="动物";

	public void say() {
		System.out.println("我是动物，大家好");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
