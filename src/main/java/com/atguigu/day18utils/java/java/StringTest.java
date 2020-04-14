package com.atguigu.day18utils.java.java;

import org.junit.Test;

/**
 	String:
 	
 	说明：
 		1.String被final所修饰，表明此类不能被继承
 		2.String实现了Serializable接口，可以被序列化（可以将内存中的对象写入到磁盘上）。
 				进程之间传输的数据必须可以被序列化。
 		3.String实现了Comparable接口，用来比较内容。
 		4.String实现了CharSequence接口，可以获取字符串的长度，截取子串等操作。
 		5.String的底层是一个char[],而且被final所修饰。
 		6.String是不可变的字符序列
 */
public class StringTest {
	
	/**
	 *  只要有变量参与字符串拼接，那么就会调用StringBuilder中的toString方法重新new String();
	 *  
	 *  总结 ： 只要有变量参与字符串拼接那么就会在堆中开辟一块空间。
	 */
	@Test
	public void test4(){
		String s = "hellojava";
		String s2 = "hello";
		String s3 = "java";
		String s4 = "hello" + "java";//和"hellojava"编译的结果一样
		String s5 = s2 + "java";
		String s6 = "hello" + s3;
		String s7 = s2 + s3;
		//首先会在常量池中查找是否存在s2+s3的结果，如果存在直接引用，如果不存在则创建新的。
		String s8 = (s2 + s3).intern();
		
		System.out.println(s == s4);//true
		System.out.println(s == s5);//false
		System.out.println(s == s6);//false
		System.out.println(s == s7);//false
		System.out.println(s5 == s6);//false
		System.out.println(s == s8);//true
	}
	
	/**
	 * 不可变的字符序列 : 无论字符串重新赋值还是做字符串拼接或使用API修改其中某个字符都会产生一个新的字符串对象。
	 */
	@Test
	public void test3(){
		String s = "abc";
		String s2 = "abc";
		
//		System.out.println(s == s2);//true
//		s2 = "ccc";
//		System.out.println(s == s2);//false
		
		s2 += "ccc";
		System.out.println(s == s2);
		
		System.out.println(s);
		
	}
	
	
	/**
	 * 练习
	 */
	@Test
	public void test2(){
		Person p = new Person("aa", 18);
		Person p2 = new Person("aa", 18);
		System.out.println(p.name == p2.name);//true
		
	}

	/**
	 * String的实例化
	 */
	@Test
	public void test(){
		String s = "abc";
		String s2 = "abc";
		
		String s3 = "ccc";
		String s4 = "ccc";
		
		System.out.println(s == s2);//true
		System.out.println(s3 == s4);//false
	}
}


















