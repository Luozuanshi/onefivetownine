package com.atguigu.day19Array.java3;

public class Person {

	String name;
	int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		System.out.println("--------------------equals-------------");
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
            return other.name == null;
		} else return name.equals(other.name);
    }



//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
	
	
}
