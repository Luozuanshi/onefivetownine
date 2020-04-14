package com.atguigu.day18utils.java.java2;

import java.util.Arrays;

import org.junit.Test;

/**
 	字符串相关的类：
 	
 	String:不可变的字符序列,底层是char[]被final所修饰
 	StringBuffer:可变的字符序列，底层是char[],线程安全的。
 	StringBuilder :可变的字符序列,底层是char[],线程不安全的。
 */
public class StringBufferTest {
	
	/**
	 * copyOf()
	 */
	@Test
	public void test5(){
		char[] c = {'a','c','d'};
		
		/*
		 * 作用 ：1.创建一个新的数组长度为10   2.将c数组中的内容复制到新的数组中
		 */
		char[] copyOf = Arrays.copyOf(c, 10);
		
		System.out.println(Arrays.toString(copyOf));
		System.out.println(copyOf.length);
	}
	
	/**
	 * 
	 * StringBuffer底层实现原理：
	 * 当我们通过空参的构造器创建对象时，底层会创建一个长度为16的char[]，当我们向该数组中添加第17个元素时
	 * 底层会进行扩容，扩容为原来的2倍+2.同时将原数组中的内容复制到新的数组中。
	 */
	@Test
	public void test4(){
		StringBuffer sb = new StringBuffer();//底层创建了一个长度为16的数组
		sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		System.out.println(sb.length());
	}
	
	/**
	 * StringBuffer()：初始容量为16的字符串缓冲区
StringBuffer(int size)：构造指定容量的字符串缓冲区
StringBuffer(String str)：将内容初始化为指定字符串内容    

	 */
	@Test
	public void test3(){
		//StringBuffer()：初始容量为16的字符串缓冲区
		StringBuffer sb = new StringBuffer();
		//StringBuffer(int size)：构造指定容量的字符串缓冲区
		new StringBuffer(30);
		//StringBuffer(String str)：1.创建一个长度为 ： str.length() + 16的数组     2.同时将str放入到数组中
		StringBuffer sb2 = new StringBuffer("abcdefg");
		System.out.println(sb2);
	}
	/**
	 * API
	 * StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
StringBuffer delete(int start,int end)：删除指定位置的内容
StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
StringBuffer insert(int offset, xxx)：在指定位置插入xxx
StringBuffer reverse() ：把当前字符序列逆转
public int indexOf(String str) : str的当前字符串中从左开始首次出现的位置。找不到返回-1
public String substring(int start,int end) : 截取子串从start到end
public int length() ; 字符串长度
public char charAt(int n ) ：获取指定位置上的字符
public void setCharAt(int n ,char ch) ： 把当前字符串中的n的索引位置的字符变成ch
	 */
	@Test
	public void test2(){
		StringBuffer sb = new StringBuffer();
		//append(xxx)：提供了很多的append()方法，用于进行字符串拼接
		sb.append("abcdefg");
//		String s = null;
//		sb.append(s);
		
		//delete(int start,int end)：删除指定位置的内容 - 左闭右开
//		sb.delete(0, 2);
		
		//replace(int start, int end, String str)：把[start,end)位置替换为str
//		sb.replace(0, 2, "ABCDEFG");
		
		//insert(int offset, xxx)：在指定位置插入xxx
//		sb.insert(0, "AAAAA");
		
		//reverse() ：把当前字符序列逆转
//		sb.reverse();
		
		//setCharAt(int n ,char ch) ： 把当前字符串中的n的索引位置的字符变成ch
		sb.setCharAt(0, 'A');
		
		
		System.out.println(sb);
		System.out.println(sb.length());//字符串长度
	}

	/**
	 * 可变的字符序列
	 */
	@Test
	public void test(){
		StringBuffer sb = new StringBuffer();
		//添加内容
		sb.append("aaa");
		sb.append("ccc");
		//可变的字符序列 - 记录sb的地址值
		StringBuffer sb2 = sb;
		sb.append("ddd");
		System.out.println(sb2 == sb);//用记录的地址值和原来的sb再比较，查看sb的地址有没有发生变化？
		System.out.println(sb);
	}
}
