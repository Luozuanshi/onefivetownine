package com.atguigu.day20List.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  Collection子接口之：List

   	一 特点 ：存储的元素是有序的可重复的。
   	
   	二 实现类：
   		ArrayList:
   		LinkedList:
   		Vector:
   	
   	三 [面试题]List的实现类有哪些？有什么区别？
   		有ArrayList,LinkedList,Vector。
   		相同点：
   			ArrayList,LinkedList,Vector都是List接口的实现类，存储的元素都是有有序可重复的。
   		不同点：
   			ArrayList: 主要实现类。底层是数组,线程不安全。数组查找快，增删慢。
   			Vector ：古老的实现类。底层是数组,线程安全的。
   			LinkedList: 底层是双向链表。链表增删快，查找慢。
   			
   	四[面试题]ArrayList底层实现原理？
   		当我们通过ArrayList的空参构造器创建对象时，底层会创建一个长度为10的数组，当我们向集合中添加
   		第11个元素时，底层会进行扩容，扩容为原来的1.5倍，同时把原来数组中的内容复制到新的数组中。
   
 */
public class ListTest {
	
	/**
	 * LinkedList API
	 *  void addFirst(Object obj) : 向头部添加元素
		void addLast(Object obj) ：向尾部添加元素
		Object getFirst() ： 获取头部的元素
		Object getLast() ： 获取尾的元素
		Object removeFirst() ： 删除头元素
		Object removeLast() ： 删除尾元素

	 */
	@Test
	public void test4(){
		LinkedList list = new LinkedList();
		list.add("ccc");
		list.add("ddd");
		
		list.addFirst("aaa");
		list.addLast("fff");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
		
		System.out.println("----------------------------------");
		
		
		//删除头元素并返回删除掉的元素
		Object first = list.removeFirst();
		//删除尾元素并返回删除掉的元素
		Object last = list.removeLast();
		
		System.out.println("first=" + first);
		System.out.println("last=" + last);
		System.out.println(list);
		
	}
	/**
	 * ArrayList构造器：
	 * new ArrayList(); 底层创建了一个长度为10的数组
	 * new ArrayList(int initialCapacity); 底层创建了一个长度为initialCapacity的数组
	 */
	@Test
	public void test3(){
		ArrayList list = new ArrayList(); //底层创建了一个长度为10的数组
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		System.out.println(list);
	}
	
	/**
	 * 面试题
	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add(1);//自动装箱
		
		
//		list.remove(1);//根据索引位置删除元素。
		
		list.remove(new Integer(1));//根据内容删除元素
		
		System.out.println(list);
	}

	/**
void add(int index, Object ele):在index位置插入ele元素
boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
Object get(int index):获取指定index位置的元素
int indexOf(Object obj):返回obj在集合中首次出现的位置
int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
Object remove(int index):移除指定index位置的元素，并返回此元素
Object set(int index, Object ele):设置指定index位置的元素为ele
List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

	 */
	@Test
	public void test(){
		//多态（1.类与类之间的多态（父类的引用指向子类的对象）   2.接口与类之间的多态（接口的类型指向实现类的对象））
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ccc");
		List list2 = new ArrayList();
		list2.add("111");
		list2.add("222");
		
		//void add(int index, Object ele):在index位置插入ele元素
//		list.add(0, "AAA");
		
		//boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
//		list.addAll(0, list2);
		
		//Object get(int index):获取指定index位置的元素
//		Object obj = list.get(1);
//		System.out.println("obj=" + obj);
		
//		int indexOf(Object obj):返回obj在集合中首次出现的位置
//		int index = list.indexOf("ccc");
//		System.out.println(index);
		
		//Object remove(int index):移除指定index位置的元素，并返回此元素
//		Object obj = list.remove(0);
//		System.out.println("obj=" + obj);
		
		//Object set(int index, Object ele):设置指定index位置的元素为ele
//		list.set(0, "AAA");
		
		//List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合,左闭右开
		List subList = list.subList(0, 2);
		System.out.println("subList=" + subList);
		
		System.out.println(list);
	}
}
















