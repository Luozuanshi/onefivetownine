package com.atguigu.day26reflect.java2;

public class Person {

	private String personName;
	public int personAge;
	protected int personSex;
	
	public void personPublicShow(){
		System.out.println("personPublicShow");
	}
	
	private void personPrivateTest(){
		System.out.println("personPrivateTest");
	}
}
