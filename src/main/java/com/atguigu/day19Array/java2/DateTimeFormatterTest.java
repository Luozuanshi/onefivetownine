package com.atguigu.day19Array.java2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {

	/**
	 * 定义时间格式的三种方式：
	 *  1.预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
		2.本地化相关的格式。如：ofLocalizedDateTime(FormatStyle.LONG)
		3.自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)

	     两个方法：
	     format(TemporalAccessor temporal) : 将LocalDateTime对应的日期时间转成相对应格式的String内容
	     parse(String time) : 将字符时间的内容转成对应的日期时间的对象。
	 */
	@Test
	public void test(){
		LocalDateTime dateTime = LocalDateTime.now();
		//1.预定义的标准格式
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		//format(TemporalAccessor temporal) : 将LocalDateTime对应的日期时间转成相对应格式的String内容
		String time = dtf.format(dateTime);
		System.out.println(time);
		
		
		//2.本地化相关的格式 - 注意 ：日期时间的格式必须和使用LocalDateTime,LocalDate,LocalTime必须对应
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(dtf2.format(dateTime));
		
		//自定义的格式
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(dtf3.format(dateTime));
		//parse(String time) : 将字符时间的内容转成对应的日期时间的对象。
		TemporalAccessor parse = dtf3.parse("2019-12-24 02:15:04");
		System.out.println(parse);
	}
}
















