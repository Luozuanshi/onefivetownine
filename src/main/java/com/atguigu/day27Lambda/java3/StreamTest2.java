package com.atguigu.day27Lambda.java3;

import com.atguigu.day27Lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Stream中间操作
 */
public class StreamTest2 {
	static ArrayList<Employee> list = new ArrayList<>();

	static {
		list.add(new Employee("aaa", 18, 2000));
		list.add(new Employee("cccccc", 20, 5000));
		list.add(new Employee("ddddd", 25, 6000));
		list.add(new Employee("ff", 30, 8000));
		list.add(new Employee("bbb", 35, 3000));
	}
	
	/**
	 *  sorted()——自然排序
		sorted(Comparator com)——定制排序

	 */
	@Test
	public void test6(){
		list.stream().sorted((o1,o2) -> o1.getAge()-o2.getAge()).forEach(System.out::println);
	}
	
	/**
	 *  map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
		练习：获取员工姓名长度大于3的员工的姓名。
		flatMap(Function f)——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。

	 */
	@Test
	public void test5(){
		System.out.println(Arrays.toString("abc".split("")));
	}
	@Test
	public void test4(){
		String[] names ={"xiaocang","xiaoze","zhangsan"}; 
		
		Arrays.stream(names)
			.flatMap(name -> Arrays.stream(name.split("")))
			.map(n -> n.toUpperCase())
			.forEach(System.out::println);
		
	}
	//练习：获取员工姓名长度大于3的员工的姓名。
	@Test
	public void test3(){
		list.stream()
			.filter(e -> e.getName().length() > 3)
			.map(e -> e.getName())
			.forEach(System.out::println);
	}
	@Test
	public void test2(){
		list.stream()
//			.map(new Function<Employee, String>() {
//
//				@Override
//				public String apply(Employee t) {
//					return t.getName();
//				}
//			})
			.map(e -> e.getName())
			.forEach(System.out::println);
	}

	/**
	 *  filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
		limit(n)——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素

	 */
	@Test
	public void test() {
		list.stream()
//			.filter(e -> e.getAge() > 20)// 从流中排除某些元素。
//			.limit(2) //截断流，使其元素不超过给定数量。
//			.skip(1) //跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
			.distinct() //去重
			.forEach(System.out::println);
	}
}


















