package com.atguigu.day19Array.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 增强for循环
 * 
 * 作用 ： 用来遍历数组和集合的内容。
 * 
 * 格式：
 * 		for(元素的类型  变量名 ： 数组、集合的对象){
 * 		}
 */
public class ForeachTest {
	
	/*
	 * 注意的细节
	 */
	@Test
	public void test2(){
		String[] names = {"蔡徐坤","小龙哥","乔碧罗","松小果"};
		
//		for (int i = 0; i < names.length; i++) {
//			names[i] = "小饭老师";
//		}
		
		/*
		 * String name = names[i];
		 * name = "小饭老师";
		 */
		for(String name : names){
			name = "小饭老师";//改的是临时变量的值
		}
		
		System.out.println(Arrays.toString(names));
	}

	/*
	 * 遍历数组,集合
	 */
	@Test
	public void test(){
		String[] names = {"蔡徐坤","小龙哥","乔碧罗","松小果"};
		//使用增强for循环遍历数组
		for(String name : names){
			System.out.println(name);
		}
		
		System.out.println("-----------------------");
		
		Collection c = new ArrayList();
		c.add("志玲");
		c.add("苍老师");
		c.add("小泷老师");
		c.add("小泽老师");
		
		
		for(Object obj : c){
			System.out.println(obj);
		}
	}
	
}
