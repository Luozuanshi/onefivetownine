package com.atguigu.day20List.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayToCollection {
	
	/**
	 * 导包 ： 快捷键 ：ctrl + shift + o
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("ccc");
	}

	/**
	 * 数组转集合 : Arrays.asList(Object...obj)
	 */
	@Test
	public void test(){
		
		String[] names = {"aa","cc","dd"};
		
		String[] asList = names;
		
		for (Object object : asList) {
			System.out.println(object);
		}
	}
}
