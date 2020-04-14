package com.atguigu.day20List.java3;

public class Person implements Comparable {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Person ){
			//向下转型
			Person p = (Person) o;
			//安照年纪排序
			return -(this.age - p.age);
			
		}
		return 0;
	}

}
