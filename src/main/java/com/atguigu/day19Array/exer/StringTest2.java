package com.atguigu.day19Array.exer;

class Person{
	
	int age;
}
public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "hello";
		test(str);
		System.out.println(str);
		
		System.out.println("-------------------------------------");
		
		Person person = new Person();
		person.age = 10;
		test2(person);
		System.out.println(person.age);
	}
	
	public static void test2(Person p){
//		p.age = 30;
		p = new Person();
		p.age = 30;
	}
	
	public static void test(String s){
		s = "ccc";
	}
}
