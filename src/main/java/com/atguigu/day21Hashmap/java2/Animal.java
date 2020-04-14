package com.atguigu.day21Hashmap.java2;

public class Animal {

	String name;
	int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + " age=" + age;
	}

}
