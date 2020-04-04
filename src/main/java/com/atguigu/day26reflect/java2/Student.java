package com.atguigu.day26reflect.java2;



@MyAnn(name="com.atguigu.java2.Student")
public class Student extends Person {
	
	@MyAnn(name="student")
	public Student(){
		System.out.println("---------创建对象了------------");
	}

	
	private String studentName;
	
	@MyAnn(name="studentAge")
	public int studentAge;
	
	public void studentPublicShow(int age){
		System.out.println("studentPublicShow======" + age);
	}
	
	private void studentPrivateTest(){
		System.out.println("studentPrivateTest");
	}
	
	public void info(){
		System.out.println(studentName);
	}
}
