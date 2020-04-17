package com.atguigu.day19Array.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	
	/**
	 * 大家常犯的错误
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		//常犯错误一
//		while(c.iterator().hasNext()){
//			System.out.println(c.iterator().next());
//		}
		
		//常犯错误二
		Iterator iterator = c.iterator();
		while(iterator.next() != null){
			System.out.println(iterator.next());
		}
	}

	/**
	 * Iterator接口 ： 用来遍历集合中的元素
	 * iterator() : 返回一个实现了Iterator接口的实现类的对象
	 * next() : 1.指针下移  2.获取指针指向的元素
	 * hasNext() : 是否还有下一个元素
	 */
	@Test
	public void test(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		/*
		 * iterator() : 返回一个实现了Iterator接口的实现类的对象
		 */
		Iterator iterator = c.iterator();
		
		//next() : 1.指针下移  2.获取指针指向的元素
		//遍历集合中的元素
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		
		//hasNext() : 是否还有下一个元素
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}





















