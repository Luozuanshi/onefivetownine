/**
 * 
 */
package com.atguigu.day21Hashmap.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;

/**
   * 创建时间2019年12月27日下午7:48:12
   * 类描述
 */
public class MapImpClass {
	
	/**
	 * Properties
	 * @throws Exception 
	 */
	@Test
	public void test4() throws Exception {
		//创建Properties对象
		Properties properties = new Properties();
		//创建流对象
		FileInputStream fis = new FileInputStream("user.properties");
		//加载流
		properties.load(fis);
		//读数据
		String name = properties.getProperty("username");
		System.out.println(name);
//		关闭流
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
	public void test2() {
		TreeMap map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person) {
					Person p1 = (Person)o1;
					Person p2 = (Person)o2;
					return p1.id -p2.id;
				}
				return 0;
			}
		});
		
		
		
//		
		map.put(new Person(20, "hello"),"1");
		map.put(new Person(10, "回学校不"),"2");
		map.put(new Person(11, "虎呆"),"3");
		System.out.println(map);
		
	}
	
	/**
	 * LinkedHashMap: 可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
	 * 	LinkedHashMap是HashMap的子类。LinkedHashMap底层实现和HashMap底层实现一样。
	 */
	@SuppressWarnings(value = { "unchecked" })
	@Test
	public void test() {
		@SuppressWarnings("rawtypes")
		LinkedHashMap map = new LinkedHashMap();
		map.put("赵六", 20);
		map.put("张三", 10);
		map.put("李四", 30);
		map.put("王五", 20);
		
		System.out.println(map);
	}
}
