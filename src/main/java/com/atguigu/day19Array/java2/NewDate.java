package com.atguigu.day19Array.java2;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
	jdk1.8新日期时间API（了解）
 */
public class NewDate {
	
	/**
	 * LocalDate:本地日期
	 * LocalTime:本地时间
	 * LocalDateTime:本地日期和时间
	 */
	@Test
	public void test2(){
		//now() : 静态方法，根据当前时间创建对象/指定时区的对象
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		
		//of() :静态方法，根据指定日期/时间创建对象
		LocalDate of = LocalDate.of(2019, 12, 24);
		System.out.println(of);
		
		/*
		 * getDayOfMonth()/getDayOfYear()
		 */
		System.out.println(localDate.getDayOfMonth());//当天是当月的第几天
		//获取年份
		System.out.println(localDate.getYear());
		//将月份天数、年份天数、月份、年份修改为指定的值并返回新的对象
		LocalDate withDayOfMonth = localDate.withDayOfMonth(20);
		System.out.println("新的对象:" + withDayOfMonth);
		System.out.println("原来的对象:" + localDate);
	}

	/**
	 * jdk1.8之前日期时间API存在的问题
	 */
	@Test
	public void test(){
		//偏移性问题
		Date date = new Date(2019, 12, 24);
		System.out.println(date);
		//可变性：像日期和时间这样的类应该是不可变的。
	}
}
