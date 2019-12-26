/**
 * 
 */
package com.atguigu.day20List.exercise;

/**
 * 项目名称：domo 类名称：Person
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月26日上午11:21:37 类描述
 */
public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	 @Override public int hashCode() { final int prime = 31; int result = 1;
	 result = prime * result + age; result = prime * result + ((name == null) ? 0
	 : name.hashCode()); return result; }
	 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
