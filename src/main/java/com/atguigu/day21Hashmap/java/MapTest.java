package com.atguigu.day21Hashmap.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

/**
	Map（双列集合）:
	
	一 Map的实现类：
		|------HashMap ：是Map的主要实现类。HashMap是线程不安全的。HashMap的key和value可以是null
			
			|------LinkedHashMap ：可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
	  	LinkedHashMap是HashMap的子类。LinkedHashMap底层实现和HashMap底层实现一样。
			
		|------Hashtable ：是一个古老的实现类。Hashtable是线程安全的。Hashtable的key和value不可以是null
			
			|------Properties : Properties的key和value都是String类型。常用来读取配置文件中的内容。
			
		|------TreeMap : TreeMap可以对key中指定的属性进行排序。
				注意：只能对key排序。
	
	二 Map的说明：
		1.Map的特点 ：存储的是健值对
		2.Map中的健值对可以看成是一个Entry
			(Map中的健值对在存储的时候底层创建一个Node类的对象并把健值对的内容放到该对象的属性中。Node实现了Entry接口)
		3.Map中的key是无序的不可重复的。向Map中的key添加的自定义类的对象必须重写equals和hashCode方法。
			可以把所有的key看成是Set的集合。
		4.Map中的value是无序的可重复的。向Map中的value添加自定义类的对象必须重写equals方法
			可以把所有的value看成是Collection的集合
		5.Map中的Entry(Node)是无序的不可重复的，Entry在数组的位置是由key决定的。	
			
	
	三 Set的再说明
		1.HashSet的底层就是HashMap,向HashSet中添加的数据实际上添加到了HashMap的key中。
			因为HashMap的key必须重写hashCode和equals方法所以向HashSet中添加的内容必须重写hashCode和equals方法。
			
	四 ：面试题
		1.HashMap和Hashtable的区别？
		2.HashMap的底层实现原理？
			当我们向集合中添加k1,v1时首先根据k1的哈希值来决定元素存放的位置。如果该位置上没有其它元素，则直接存放。
			如果该位置上已经存在其它元素k2,v2那么会调用equals方法让k1和k2进行比较。如果结果为true那么value进行覆盖
			v1覆盖v2。如果equals的结果为false那么将以链表的形式存放该元素。（在jdk1.8时，当链表上的元素的数量达到8时
			那么链表会替换成红黑树）
			
		3.为什么要扩容2倍（了解一下）。
		  16 ，32，64 ......
		  15, 31, 63
		
		  像15,31,63这些数值的二进制最后几位全部是1.
		  如果最后几位全部是1的话那么hash值是多少都能得到0~15，0~31,0~63
		  （数组上的每一个索引位置都可能算到，否则一定有些索引位置将永远无法得到，也就是将永远无法存数据）
		  
		  1111
		  0000
		  -----
		  1111
		  
		  1111
		  0100
		  ----
		  0100
		  
		  1111
		  x
		  ----
		  x
		  
		  如果不是1111存在的问题
		  1011
		  0100
		  ----
		  0000
		  
		  1011
		  0111
		  ----
		  0011   注意 ：那么将有一些数值永远无法得到
		  
		  
	五 ：HashMap的构造器：
	    new HashMap() : 底层会创建一个长度为16的数组(Node类型)，加载因子为0.75，当我们向集合中添加的数据
	         超过12 （16 * 0.75）时便会扩容，扩容为原来的2倍。
	         
	  
		
 */
public class MapTest {
	/**
	 * HashMap的构造器
	 */
	@Test
	public void test3(){
		new HashMap();
	}
	
	/**
	 * HashMap和Hashtable的区别
	 */
	@Test
	public void test2(){
		
//		HashMap hashMap = new HashMap();
//		hashMap.put(null, null);
//		System.out.println(hashMap);
		
		Hashtable hashtable = new Hashtable();
		hashtable.put(null, null);
		System.out.println(hashtable);
	}

	@Test
	public void test(){
		
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		
		System.out.println(map);
	}
}
