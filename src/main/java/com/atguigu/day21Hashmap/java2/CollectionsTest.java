package com.atguigu.day21Hashmap.java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * 
 * [面试题]Collection和Collections的区别？
 *
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
	public void test2(){
		List src = new ArrayList();
		src.add("ddd");
		src.add("ddd");
		src.add("ddd");
		src.add("aaa");
		src.add("bbb");
		
		//Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
//		System.out.println(Collections.max(list));
		
		//int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
//		System.out.println(Collections.frequency(list, "ccc"));
		
		ArrayList dest = new ArrayList();
		
		
//		void copy(List dest,List src)：将src中的内容复制到dest中 - 不建议使用
//		Collections.copy(dest, src);
//		copy(dest,src);
		
		//boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
		Collections.replaceAll(src, "ddd", "DDD");
		
		System.out.println(src);
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
	public void test(){
		List list = new ArrayList();
		list.add("ccc");
		list.add("ddd");
		list.add("aaa");
		list.add("bbb");
		
//		list.add(new Animal("aaa", 3));
//		list.add(new Animal("ddd", 5));
//		list.add(new Animal("ccc", 2));
		
		//reverse(List)：反转 List 中元素的顺序
//		Collections.reverse(list);
		
		//shuffle(List)：对 List 集合元素进行随机排序
//		Collections.shuffle(list);
		
		//sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
//		Collections.sort(list,new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				if(o1 instanceof Animal && o2 instanceof Animal){
//					Animal a = (Animal) o1;
//					Animal a2 = (Animal) o2;
//					return a.age - a2.age;
//				}
//				return 0;
//			}
//		});
		
		
		//swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
		Collections.swap(list, 0, 2);
		System.out.println(list);
	}
}
