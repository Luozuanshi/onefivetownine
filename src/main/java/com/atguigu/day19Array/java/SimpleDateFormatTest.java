package com.atguigu.day19Array.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * SimpleDateFormat : 用来格式化日期和时间
 * 
 * 两个方法：
 * 		format(Date date) : 传一个date返回一个对应格式的日期和时间的字符串
 *		parse(String source) ： 通过一个日期时间的字符串获取对应的Date
 *		注意 ：SimpleDateFormat对象的日期时间格式和字符串的日期时间格式必须保持一致否则解析失败
 */
public class SimpleDateFormatTest {

	@Test
	public void test() throws ParseException{
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat();
		//format(Date date) : 传一个date返回一个对应格式的日期和时间的字符串
		String dateTime = sdf.format(new Date());//19-12-24 上午10:58
		System.out.println(dateTime);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-'W'ww-u");
		System.out.println(sdf2.format(new Date()));//2019-W52-2
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(new Date()));//2019-12-24 11:01:44
		
		//通过一个日期时间的字符串获取对应的Date
		//注意 ：SimpleDateFormat对象的日期时间格式和字符串的日期时间格式必须保持一致否则解析失败
		java.util.Date date = sdf3.parse("2019-12-24 11:01:44");
		System.out.println(date);
	}
}
