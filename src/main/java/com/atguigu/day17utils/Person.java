/**
 * 
 */
package com.atguigu.day17utils;

/**
   * 项目名称：domo
   *类名称：Person
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月21日上午10:30:52
   * 类描述
 */
public class Person {

	private String name;
	private int age;
	private char gender;
	
	Person(){
		this("nihao",20,'男');
	}
	
	Person(String name){
		this("nihao",20,'男');
		this.name = name;
	}
	Person(String name,int age){
		this("nihao",20,'男');
		this.name = name;
		this.age = age;
	}
	
	Person(String name,int age ,char gender){
		this.name = name;
		this.age = age;
		this.gender =gender;
	}
	
	
	public void test() {
		System.out.println("ok");
	}
}
