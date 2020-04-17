/**
 * 
 */
package com.atguigu.day21Hashmap.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**

   * 创建时间2019年12月27日下午8:18:38
   * 类描述
 */
public class CollectionsTest {
	
	/**
	 * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中 - 不建议使用
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

	 */
	
	@Test
	public void test2() {
		ArrayList list = new ArrayList();
		list.add("1000");
		list.add("0");
		list.add("2000");
		list.add("2000");
		list.add("10");
		
		Object max = Collections.max(list);//根据自然排序返回集合中最大元素
		System.out.println(max);
		
		System.out.println(Collections.frequency(list, "2000"));
		 
		ArrayList dest = new ArrayList();
		dest.add("1000");
		dest.add("0");
		dest.add("2000");
		dest.add("2000");
		dest.add("10");
		
		copy(dest, list);
		System.out.println(dest);
		
		Collections.sort(dest);
		System.out.println(dest);
		
		
		Collections.replaceAll(list, "2000", "30000");
		System.out.println(list);
	}
	
	public void copy(List dest,List src){
		//校验
		for (Object obj : src) {
			dest.add(obj);
		}
	}
	
	/**
	 * reverse(List)：反转 List 中元素的顺序
shuffle(List)：对 List 集合元素进行随机排序
sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

	 */
	@Test
	public void test() {
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("cccd");
		Collections.reverse(list);//反转集合中的元素的顺序
		System.out.println(list);
		
		Collections.shuffle(list);//对List集合中的元素进行随机排序
		System.out.println(list);
		
		Collections.sort(list);//根据元素的自然顺序对指定的List集合元素升序排序
		System.out.println(list);
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return -1;
			}
		});//按自定义实现comparator接口方式排序
		
		System.out.println(list);
		
		Collections.swap(list, 0, 2);//把0处元素和j处元素调换
		System.out.println(list);
	}
}
