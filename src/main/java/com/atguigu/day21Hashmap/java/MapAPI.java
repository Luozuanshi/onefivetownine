package com.atguigu.day21Hashmap.java;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
	Map API
 */
public class MapAPI {
	
	/*
	 * Set keySet()：返回所有key构成的Set集合
	Collection values()：返回所有value构成的Collection集合
	Set entrySet()：返回所有key-value对构成的Set集合

	 */
	@Test
	public void test4(){
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("ccc", "CCC");
		map.put("bbb", "BBB");
		map.put("ddd", "DDD");
		
		//Set keySet()：返回所有key构成的Set集合
		Set keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(key);
		}
		
		System.out.println("------------------------");
		//Collection values()：返回所有value构成的Collection集合
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value.toString());
		}
		
		System.out.println("------------------------");
		//Set entrySet()：返回所有key-value对构成的Set集合
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			//调用接口中的方法 - 向下转型
			Map.Entry entry = (Entry) object;//多态 ：接口的类型指向该接口实现类的对象
			System.out.println(entry.getKey() + "-----" + entry.getValue());
		}
	}
	
	/*
	 * Object get(Object key)：获取指定key对应的value
boolean containsKey(Object key)：是否包含指定的key
boolean containsValue(Object value)：是否包含指定的value
int size()：返回map中key-value对的个数
boolean isEmpty()：判断当前map是否为空
boolean equals(Object obj)：判断当前map和参数对象obj是否相等

	 */
	@Test
	public void test3(){
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("ccc", "CCC");
		map.put("bbb", "BBB");
		map.put("ddd", "DDD");
		
		Map map2 = new HashMap();
		map2.put("bbb", "BBB");
		map2.put("ddd", "DDD");
		map2.put("aaa", "AAA");
		map2.put("ccc", "CCC");
		
		//判断两个集合中元素的内容，个数，顺序（数组中存放的）是否相同。
		System.out.println(map.equals(map2));
	}
	
	@Test
	public void test2(){
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("ccc", "CCC");
		map.put("bbb", "BBB");
		map.put("ddd", "DDD");
		map.put("ffff", new Animal("二哈"));
		
//		Object get(Object key)：获取指定key对应的value
		System.out.println(map.get("aaa"));
		
		//boolean containsKey(Object key)：是否包含指定的key
		System.out.println(map.containsKey("aaa"));
		
		//boolean containsValue(Object value)：是否包含指定的value
		System.out.println(map.containsValue(new Animal("二哈")));
	}
	
	
	
	/*
	 *  添加、删除、修改操作：
		Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
		void putAll(Map m):将m中的所有key-value对存放到当前map中
		//向key中添加的自定义类的对象所在的类必须重写hashCode方法和equals方法
		Object remove(Object key)：移除指定key的key-value对，并返回value
		void clear()：清空当前map中的所有数据

	 */
	@Test
	public void test(){
		Map map = new HashMap();
		//注意 ：如果key相同那么value进行覆盖。
		map.put("aaa", "AAA");
		map.put("ccc", "CCC");
		map.put(new Person("小龙哥"), "小龙哥");

		
		//void putAll(Map m):将m中的所有key-value对存放到当前map中
//		Map map2 = new HashMap();
//		map2.put(111, "111");
//		map2.put(222, "222");
//		map.putAll(map2);
		
//		Object remove(Object key)：移除指定key的key-value对，并返回value
//		Object value = map.remove(new Person("小龙哥"));
//		System.out.println("value=" + value);
		
		//void clear()：清空当前map中的所有数据
		map.clear();
		
		System.out.println(map);
		
	}
}















