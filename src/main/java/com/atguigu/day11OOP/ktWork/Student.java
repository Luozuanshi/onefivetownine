/**
 * 
 */
package com.atguigu.day11OOP.ktWork;

/**
   * 项目名称：domo
   *类名称：Student
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月13日上午10:53:52
   * 类描述 编写一个Person类，包括属性/private（name、age），构造器、方法say(返回自我介绍的字符串）。
编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)。
编写Test类，分别创建Person和Student对象，调用say方法输出自我介绍。
 */
public class Student extends Person {
	private int id;
	private double score;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public void say() {
		System.out.println("Student name ="+getName()+" age = "+getAge()+" score = "+score +" id = "+id);
	}
	
	public static void main(String[] args) {
		Person person = new Person("张撒您", 18);
		Student student = new Student("张2您", 20);
		student.id = 1000;
		student.score = 100.00;
		student.say();
	}
	

}
