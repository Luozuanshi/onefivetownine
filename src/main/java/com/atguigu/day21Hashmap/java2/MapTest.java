package com.atguigu.day21Hashmap.java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;

import org.junit.Test;

public class MapTest {
	
	/**
	 * Properties
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
		//创建Properties的对象
		Properties properties = new Properties();
		//创建流的对象
		FileInputStream fis = new FileInputStream("user.properties");
		//加载流
		properties.load(fis);
		//读数据
		String name = properties.getProperty("name");
		String password = properties.getProperty("password");
		System.out.println(name + "===" + password);
		//关流
		fis.close();
	}
	
	/**
	 * TreeMap:
	 * 说明：
	 * 	  1.TreeMap可以对key指定的属性进行排序，对value不能排序
	 *    2.TreeMap底层是红黑树
	 *    3.TreeMap的排序方式 ：自然排序 vs 定制排序
	 *    4.TreeMap的key添加的元素的类型必须一致。
	 */
	@Test
	public void test2(){
		
		TreeMap map = new TreeMap<>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = (Person) o1;
					Person p2 = (Person) o2;
					return p1.age - p2.age;//安照key中的属性age进行排序
				}
				return 0;
			}
		});
		
		map.put(new Person("aaa", 18), 100);
		map.put(new Person("ccc", 16), 103);
		map.put(new Person("ddd", 19), 102);
		map.put(new Person("bbb", 15), 101);
		
		
		System.out.println(map);
	}

	/**
	 * LinkedHashMap: 可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
	 * 	LinkedHashMap是HashMap的子类。LinkedHashMap底层实现和HashMap底层实现一样。
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void test(){
		@SuppressWarnings("rawtypes")
		LinkedHashMap map = new LinkedHashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		
		System.out.println(map);
	}
}
