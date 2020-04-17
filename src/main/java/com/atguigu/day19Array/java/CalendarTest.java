package com.atguigu.day19Array.java;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar ：日历类 (不用敲)
 *
 */
public class CalendarTest {

	@Test
	public void test() {
		// 多态 : 返回的是一个Calendar子类的对象
		Calendar calendar = Calendar.getInstance();
		// 获取对象所在类的全类名（先了解即可）
		System.out.println(calendar.getClass().getName());

		// 获取当天是当月的第几天
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);

		// 在原来的基础上多加一天(加是正数，减是负数)
//		calendar.add(Calendar.DAY_OF_MONTH, -1);
		
		//修改当天是当月的第几天
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		
		//获取日历所对应的日期和时间
		Date date = calendar.getTime();
		System.out.println(date);

		// 获取当天是当月的第几天
		day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}







