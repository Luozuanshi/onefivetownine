package com.atguigu.day20List.java3;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 	TreeSet : 可以对添加的元素进行排序。
 	
 	说明：
 		1.TreeSet的底层是红黑树。
 		2.TreeSet中添加的元素必须是相同的类型。
 		
 	 排序方式： 自然排序 vs 定制排序
 	 
 	 思考 ： 1.自然排序和定制排序哪个更好？   2.自然排序和定制排序都存在的情况下谁起作用？
 	 		
 	 		2.自然排序和定制排序都存在的情况下，定制排序起作用
 */
public class TreeSetTest {
	
	/**
	 * 定制排序
	 * 1.创建Comparator接口的实现类的对象
	 * 2.重写compare方法
	 * 3.在compare方法中安照指定的属性进行排序。
	 * 4.将Comparator接口实现类的对象作为实参传到TreeSet的构造器中
	 * 5.将数据添加到TreeSet的集合中
	 */
	@Test
	public void test4(){
		//创建一个Comparator接口的实现类的对象
		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					//向下转型
					Person p = (Person) o1;
					Person p2 = (Person) o2;
					//安照年纪排序
					return p.age - p2.age;
				}
				return 0;
			}
		};
		
		TreeSet set = new TreeSet(comparator);
		set.add(new Person("aaa", 18));
		set.add(new Person("ddd", 20));
		set.add(new Person("ccc", 10));
		set.add(new Person("bbb", 9));
		
		System.out.println(set);
	}

	/**
	 * 自然排序：
	 * 1.自定义类并实现Comparable接口
	 * 2.重写compareTo方法
	 * 3.安照指定的属性进行排序。
	 * 4.向TreeSet中添加元素
	 */
	@Test
	public void test3(){
		TreeSet set = new TreeSet();
		set.add(new Dog("aaa", 5));
		set.add(new Dog("aaa", 3));
		set.add(new Dog("aaa", 2));
		set.add(new Dog("bbb",6));
		set.add(new Dog("ddd",2));
		
		System.out.println(set);
	}
	
	@Test
	public void test(){
		TreeSet set = new TreeSet();
//		set.add("aaa");
//		set.add("ccc");
//		set.add("bbb");
//		set.add("ddd");
		
		set.add(10);
		set.add(1);
		set.add(5);
		set.add(20);
		
		System.out.println(set);
	}
}
