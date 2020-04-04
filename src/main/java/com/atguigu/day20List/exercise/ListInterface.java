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
package com.atguigu.day20List.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
   * 项目名称：domo
   *类名称：InnerClass
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月25日下午5:12:16
   * 类描述
 */
public class ListInterface extends B implements A {
	
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
	public void test4() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("bbb");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		list.addFirst("HEllo");
		list.addLast("world");
		
		String first = list.getFirst();
		System.out.println(first);
		
		String last = list.getLast();
		System.out.println(last);
		
		list.removeLast();
		
		System.out.println(list);
		
		float f = Float.parseFloat("12.1");
		System.out.println(f);
		
		String s = ""+5;
		System.out.println(s);
		
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//
		
		Object o2;
		if (true)
		    o2 = new Integer(1);
		else
		    o2 = new Double(2.0);
		System.out.println(o2);//
		
		Integer i = new Integer(1);
	    Integer j = new Integer(1);
	    System.out.println(i == j);

	    Integer m = 1;
	    Integer n = 1;
	    System.out.println(m == n);//

	    Integer x = 128;
	    Integer y = 128;
	    System.out.println(x == y);//


	}
	
	/**
	 * ArrayList 构造器
	 * new ArryList();底层创建了一个长度为10的数组
	 * new ArryList(int initialCapacity);底层创建了一个长度为initialCapacity的数组
	 */
	@Test
	public void test3() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		arrayList.add("112344134124");
		System.out.println(arrayList);
	}
	
	
	/**
	 * 面试题
	 */
	@Test
	public void test2() {
		List list = new ArrayList();
		list.add("aaa");
		list.add("nnn");
		list.add("12");
		list.add(1);//自动装箱
		
//		list.remove(1);
		list.remove(new Integer(1));
		System.out.println(list);
	}
	
	/**
void add(int index, Object ele):在index位置插入ele元素
boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
Object get(int index):获取指定index位置的元素
int indexOf(Object obj):返回apogee在集合中首次出现的位置
int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
Object remove(int index):移除指定index位置的元素，并返回此元素
Object set(int index, Object ele):设置指定index位置的元素为ele
List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

	 */
	@Test
	public void test() {
		List c = new ArrayList();
		c.add("element");
		c.add(0, "element1");//指定index位置插入ele元素
		c.add("element");
			
		System.out.println(c);
		
		List c1 = new ArrayList();	
		c1.add("laol ");
		c.addAll(c1); //把当前集合c1元素添加到当前调用对象集合c中
		
		System.out.println(c);	
		
		Object object = c.get(3);
		System.out.println(object);//获取集合c中元素索引从0计算		
		
		int indexOf = c.indexOf("laol ");
		System.out.println(indexOf);//获取当前内容在集合中首次出现的位置
		
		c.addAll(2, c);
		System.out.println(c);
		
		int lastIndexOf = c.lastIndexOf("element");
		System.out.println(lastIndexOf);//获取当前内容在集合中最后出现的位置
		
		
		Object remove = c1.remove(0);
		System.out.println(remove);
		System.out.println(c1);//删除集合中指定位置的元素
		
		c.set(0, "666");
		System.out.println(c);//修改指定位置的元素
		
		List subList = c.subList(1, 3);
		System.out.println(subList);//截取集合中元素返回一个新的集合，元素下表左闭右开
		
	}
	
	/**
	 * 数组转集合
	 */
	@Test
	public void arrayToCollection() {
		String[] name = {"aa","bb","dd"};
		String[] asList = name;
		
		for (String string : asList) {
			System.out.println(string);
		}
	}
	

	public int addOne(final int x) {
        // o = new Other();
      return x + 1;
    }

	public static void main(String[] args) {
		 ListInterface l =new ListInterface();
		 l.pX();
	}
	 public void pX() {
	        System.out.println(x);
	    }

	
}
class Other {
    public int i;
}
interface A {
    int x = 0;
}
class B {
    int y = 1;
}


class Ball implements Rollable {
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public void play() {
    	Ball ball = new Ball("Football");
        System.out.println(ball.getName());
    }
}

interface Playable {
    void play();
}

interface Bounceable {
    void play();
}

interface Rollable extends Playable, Bounceable {
    Ball ball = new Ball("PingPang");

}

