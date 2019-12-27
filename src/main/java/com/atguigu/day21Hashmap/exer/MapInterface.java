/**
 * 
 */
package com.atguigu.day21Hashmap.exer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
   * 创建时间2019年12月27日下午5:55:15
   * 
   * 
   * TreeMap可以对key中指定的属性进行排序，注意只能对Key排序
   Map的说明
   
   1.Map的特点：存储的是键值对
   2.Map中的键值对可以看成一个Entry
   		(Map中的键值对在存储底层创建一个Node类的对象，并把键值对的内容放到该对象的属性中，Node实现了Entry接口)
   		3.Map中的key是无序的不可重复的。向Map中的Key添加的自定义类的对象必须重写hashCode和equals方法
   			可以把所有的key开成是Set集合
   4.Map中的value是无序的可重复的，想Map中的value添加自定义类的对象必须重写equals
   		可以把所有的value看成是collection的集合
   5.Map中的Entry(Node)是无序的不可重复的，Entry在数组的位置是有key决定的.
   
   
     三 Set的再说明
   1.HashSet的底层就是HashMap，向HashSet中添加的数据实际上添加到了HashMap的key中
   		因为HashMap的key必须重写hashCode和equals方法所以向HashSet中添加的内容必须重写hashCode和equals方法
   		
     四：面试题
	1.HashMap和Hashtable 的区别？
		hashMap 是线程不安全的，Hashtable是线程安全的，hashtable 的key 和value 不能为null
		hashMap 的key 和 value 可以为null
		
	2.HashMap的底层实现原理？
	当我们向集合中添加了k1,v1，时，首先根据k1哈希值决定元素存放的位置，如果该位置上没有元素，则直接存储
	如果该位置上已经存在其他元素k2，v2那么调用equals方法让k1和k2进行比较，如果结果为true那么value进行覆盖
	v2覆盖v1,。如果equals结果为false那么将以链表的形式存放元素，在jdk1.8时，当链表上元素数量达到8时
	那么链表会替换成红黑树
	
	3.为什么要扩容2倍...？
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
public class MapInterface {
	
	/*
	 * Set keySet()：返回所有key构成的Set集合
	Collection values()：返回所有value构成的Collection集合
	Set entrySet()：返回所有key-value对构成的Set集合

	 */
	@Test
	public void  test3(){
		Map map = new HashMap();
		map.put("张三",10);
		map.put("李四",21);
		map.put("王五",22);
		
		//遍历集合所有key。使用集合的keySet方法
		Set keySet = map.keySet();
		
		for (Object object : keySet) {
			System.out.println(object);
		}
		
		//遍历集合所有value, 使用集合的values方法
		Collection values = map.values();
		
		for (Object object : values) {
			System.out.println(object);
		}
		
		
		//获取集合的Entry，使用向下转型 Map.Entry  ，调用其getkeys 和 getvalue拿到对应key 和value
		Set entrySet = map.entrySet();
		
		for (Object object : entrySet) {
			Map.Entry entrySet2 = (Entry)object ;
			System.out.println(entrySet2.getKey()+"---"+entrySet2.getValue());
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
	public void test2() {
		Map map = new HashMap();
		map.put("张三",10);
		map.put("张三",20);//put key重复 替换value
		map.put("李四",30);
		System.out.println(map.get("张三"));//从map集合中取出对应key 的value
		
		System.out.println(map.containsKey("张三"));//判断集合中是否包含指定的key
		
		System.out.println(map.containsValue(10));//判断Map集合中是否包含指定的Value
		
		System.out.println(map.size());//map元素个数
		
		System.out.println(map.isEmpty());//map集合是否为空
		
		Map map1 = new HashMap();
		map1.put("李四",30);
		map1.put("张三",20);	
		//判断两个集合中元素的内容，个数，顺序（数组中存放的）是否相同。
		System.out.println(map.equals(map1));//判断当前map和参数obj是否相等
		
		
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
	public void test() {
		Map hashMap = new HashMap();
		hashMap.put("张三", 18);//从集合中添加数据
		hashMap.put("李四", 20);
		hashMap.put("王五", 21);
		hashMap.put("王五", 21);
		hashMap.put("王五", 22);
		
		Map hashMap2 = new HashMap();
		hashMap2.put("吴六", 23);
		hashMap2.put("赵七", 23);
		hashMap.putAll(hashMap2);//把集合hashMap2中的数据全部put到Map集合hashMap2
		System.out.println(hashMap);
		
		hashMap.remove("王五");//从Map集合中删除数据
		System.out.println(hashMap);
		
		hashMap.clear();
		System.out.println(hashMap);
	}
}
