package com.atguigu.day20List.java2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

/**
 	Collection子接口之 ： Set
 	
 	一 Set特点 ：存储的元素是无序的不可重复的。
 	
 	二 Set的实现类：
 		|----HashSet : Set的主要实现类
 		
 			|----LinkedHashSet :LinkedHashSet继承了HashSet,LinkedHashSet的底层实现原理和HashSet的一样。
	  	只不过LinkedHashSet可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
 			
 		|----TreeSet :
 	
 	三 说明：
 		1.无序性不是指的随机性。指的是根据hashCode方法算出的哈希值来决定的存储位置。
 		2.不可重复指的是通过equals比较的结果，如果为true表示相同，如果为false则不同。
 		
 	四 [面试题]HashSet的底层实现原理？
 	    当我们向HashSet中添加数据a时，首先会调用a对象所在类的hashCode方法算出哈希值，然后根据哈希值来决定该
 	    元素存储的位置。如果该位置上没有其它元素则直接放入。如果该位置上已经存在其它元素b时。那么会调用a元素的equals方法
 	    和b元素进行比较。如果结果为true则不能放入。如果结果为false则以链表的形式存储该元素。
 	    
 	五 ：注意 ： 向Set中添加的数据所在的类必须重写hashCode方法和equals方法
 		
 */
public class SetTest {
	
	/**
	 * LinkedHashSet : LinkedHashSet继承了HashSet,LinkedHashSet的底层实现原理和HashSet的一样。
	 * 	只不过LinkedHashSet可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
	 */
	@Test
	public void test3(){
		LinkedHashSet set = new LinkedHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		System.out.println(set);
	}
	
	@Test
	public void test2(){
		Set set = new HashSet();
		
		Person p1 = new Person("aa",18);
		set.add(p1);
		Person p2 = new Person("cc",18);
		set.add(p2);
		
		/*
		 * Object中的hashCode方法的特点 ：不同的对象的哈希值不一样，相同的对象的哈希值相同。
		 * 
		 * 重写后的hashCode方法算出的哈希值是由内容决定的。
		 */
		System.out.println("p1哈希值:" + p1.hashCode());
		System.out.println("p2哈希值:" + p2.hashCode());
		
		System.out.println(set);
	}

	@Test
	public void test(){
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add(new Person("aa",18));
		set.add(new Person("aa",18));
		
		System.out.println(set);
	}
}











