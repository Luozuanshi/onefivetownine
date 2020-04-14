package com.atguigu.day19Array.java;

import java.sql.Date;

import org.junit.Test;

class Person{
	
}

class Student extends Person{
	
}


public class DateTest {
	
	/**
	 	|----java.util.Date
	 		两个构造器：
	 			new Date() : 获取当前日期和时间
	 			new Date(long date) : 获取毫秒数所对应的时间
	 		两个方法：
	 			toString() : 以String的形式返回当前日期和时间
	 			getTime() : 获取时间所对应的毫秒数
	 			
	 			
	 	|----java.sql.Date
	 		一个构造器 ：
	 			new Date(long date) : 获取毫秒数对应的日期
	 		两个方法：
	 			toString();以String的形式返回毫秒数对应的日期
	 			getTime() : 获取日期所对应的毫秒数
	 */
	
	/*
	 * 思考 ： 如何获取当前日期
	 */
	@Test
	public void test4(){
		new java.sql.Date(new java.util.Date().getTime());
		
//		java.util.Date date = new java.util.Date();
//		//下面的写法对不对 ？ 不对的 - 要向下转型，前提是多态（父类的引用指向子类的对象）
//		java.sql.Date sd = (java.sql.Date) date;
	}
	
	/*
	 * java.sql.Date
	 */
	@Test
	public void test3(){
		java.sql.Date date = new java.sql.Date(1577154995346L);
		//以String的形式返回毫秒数对应的日期
		System.out.println(date.toString());
		//获取日期所对应的毫秒数
		System.out.println(date.getTime());
	}
	
	/*
	 * java.util.Date
	 */
	@Test
	public void test2(){
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());//Tue Dec 24 10:36:35 CST 2019
		//获取时间所对应的毫秒数
		System.out.println(date.getTime());//1577154995346
		
		System.out.println("----------------------------------------");
		
		java.util.Date date2 = new java.util.Date(1577154995346L);
		System.out.println(date2);
	}

	/**
	 * System.currentTimeMillis() ： 获取时间所对应的毫秒数
	 */
	@Test
	public void test(){
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
	}
}
