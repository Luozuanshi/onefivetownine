package com.atguigu.day19Array.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionAPI {
	
	/*
	 *  6、删除
		boolean remove(Object obj) ：通过元素的equals方法判断是否是要删除的那个元素。只会删除找到的第一个元素
		boolean removeAll(Collection coll)：取当前集合的差集 - 删除的是两个集合的交集
		 7、取两个集合的交集
		boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c
		 8、集合是否相等
		boolean equals(Object obj)
		 9、转成对象数组
		Object[] toArray()
		 10、获取集合对象的哈希值
		hashCode() : 同一个对象的值是相同的，不同的对象的哈希值是不同的
	 */
	@Test
	public void test7(){
		Person p = new Person();
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		
		Person p2 = new Person();
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p.toString());
	}
	@Test
	public void test6(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add("ccc");
		//判断两个集中元素的内容，顺序，个数都相等结果为true,否则为false
		System.out.println(c.equals(c2));
		
		//Object[] toArray() ：将集合转成数组
		Object[] array = c.toArray();
		System.out.println(Arrays.toString(array));
	}
	@Test
	public void test5(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("111");
		c.add(new Person("志玲",18));
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add("222");
		
		
		System.out.println(c);
//		c.remove(new Person("志玲",18));
		
		
//		boolean removeAll(Collection coll)：取当前集合的差集 - 删除的是两个集合的交集
//		c.removeAll(c2);
		
		
//		boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c
		c.retainAll(c2);
		
		System.out.println(c);
	}
	
	/*
	 * 5、是否包含某个元素
boolean contains(Object obj)：是通过元素的equals方法来判断是否是同一个对象
boolean containsAll(Collection c)：也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较。

	  注意 ：向Collection集合中添加的自定义类的对象，该对象所在的类的equals方法都会被重写。
	  		如果不重写那么在contains()等方法中都是比的地址值，重写后比的是内容。
	 */
	@Test
	public void test4(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("111");
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add("111");
		c2.add("111");
		c2.add("111");
		c2.add("111");
		c2.add("111");
		
		System.out.println(c.containsAll(c2));
	}
	@Test
	public void test3(){
		List c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add(new Person("小明", 18));
		
		//contains(Object obj)：当前集合中是否包含obj这个元素
		boolean contains = c.contains(new Person("小明", 18));
		System.out.println(contains);
	}
	

	/*
	 *  1、添加
			add(Object obj)
			addAll(Collection coll)
		2、获取有效元素的个数
			int size()
		3、清空集合
			void clear()
		4、是否是空集合
			boolean isEmpty()

	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		
		Collection c2 = new ArrayList();
		c2.add(111);
		c2.add(222);
		//addAll(Collection coll) : 将coll中的元素分别放入到当前集合中
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c.size());
		
	}
	@Test
	public void test(){
		//多态 ：
		Collection  c = new ArrayList();
		c.add(111);//自动装箱
		c.add("aaa");
		c.add("ccc");
		
		
		System.out.println(c);
		//size():元素的个数
		System.out.println(c.size());
		
		//clear() : 清除集合中所有的元素
		c.clear();
		System.out.println(c.size());
		
		//isEmpty() :当前集合是否为空
		System.out.println(c.isEmpty());
	}
}
