/**
 	Collection子接口之 ： Set
 	
 	一 Set特点 ：存储的元素是无序的不可重复的。
 	
 	二 Set的实现类：
 		|----HashSet : Set的主要实现类
 		
 			|----LinkedHashSet :LinkedHashSet继承了HashSet,LinkedHashSet的底层实现原理和HashSet的一样。
	  	只不过LinkedHashSet可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
 			
 		|----TreeSet :
 	
 	三 说明：
 		1.无序性不是指的随机性。指的是根据hashCode方法算出的哈希值来决定的存储位置。
 		2.不可重复指的是通过equals比较的结果，如果为true表示相同，如果为false则不同。
 		
 	四 [面试题]HashSet的底层实现原理？
 	    当我们向HashSet中添加数据a时，首先会调用a对象所在类的hashCode方法算出哈希值，然后根据哈希值来决定该
 	    元素存储的位置。如果该位置上没有其它元素则直接放入。如果该位置上已经存在其它元素b时。那么会调用a元素的equals方法
 	    和b元素进行比较。如果结果为true则不能放入。如果结果为false则以链表的形式存储该元素。
 	    
 	五 ：注意 ： 向Set中添加的数据所在的类必须重写hashCode方法和equals方法
 		
 */
package com.atguigu.day20List.exercise;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;


/**
   * 项目名称：domo
   *类名称：SetInterface
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月26日上午11:15:07
   * 类描述
 */
public class SetInterface {
	
	@Test
	public void test3() {
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person) {
					Person one = (Person)o1;
					Person tow = (Person)o2;
					
					if(one.name.compareTo(tow.name)==0) {
						if(one.age -tow.age>0) {
							return 1;
						}else if(one.age -tow.age<0){
							return -1;
						}else{
							return 0;
						}
					}else if(one.name.compareTo(tow.name)>0){
						return 1;
					}else {
						return 0 ;
					}
				}
				return 0;
				
			}
			
			
		};
		
		TreeSet set = new TreeSet(comparator);

		set.add(new Person("lisi ", 10));
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("3333");
		set.add(new Person("lisi ", 12));
		set.add("113");
		set.add(new Person("lisi ", 24));
		set.add("2222");
		set.add(new Person("lisi ", 24));
		
		
		
		
		


		
		System.out.println(set);
	}
	
	
	
	@Test
	public void test2() {
		
		/**
		 * LinkedHashSet可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
		 */
		LinkedHashSet set = new LinkedHashSet(); 
		set.add("aaafgff");
		set.add("sgff");
		set.add("aaasfafgff");
		set.add("aaasdafgff");
		System.out.println(set);
	}
	
	
	@Test
	public void test() {
		/**
		 * HashSet 
		 */
		Set set = new HashSet<Object>();
		set.add("111");
		set.add("222");
		set.add("bbb");
		set.add("aa");
		
		set.add(new Person("张三", 15));
		set.add(new Person("张3三", 19));
		set.add(new Person("张2", 52));
		set.add(new Person("张2", 52));//Set集合
		
		System.out.println(new Person("张2", 52).hashCode());
		System.out.println(new Person("张2", 52).hashCode());   
		/**
		 * //如果person类不重写hashCode方法，默认使用的是Object 类中的hashCode方法，
		 * 只要两个对象不一样，就会算出不一样的值
		 * 所以我们需要重写hashCode方法确保，相同的属性能算出一样的hashCode值决定元素的存储位置
		 * 重写后的hashCode方法算出的哈希值是有内容决定的
		 * 因为内部实现判断两个元素存储的位置一样需要再根据该对象的equals方法判断内容是否相同
		 * 默认的Object类中的equals方法是判断两个对象的地址是否相等
		 * 所以需要重写equals方法，判断两个对象的属性内容是否相等
		 */
		
		System.out.println(set);
	}
	
			
}
