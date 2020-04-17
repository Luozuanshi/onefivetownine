package com.atguigu.day27Lambda.java3;

import com.atguigu.day27Lambda.java.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * 
 * Stream终止操作 （使用Stream时必须有终止操作否则不执行）
 *
 */
public class StreamTest3 {
	static ArrayList<Employee> list = new ArrayList<>();

	static {
		list.add(new Employee("aaa", 18, 2000));
		list.add(new Employee("cccccc", 20, 5000));
		list.add(new Employee("ddddd", 25, 6000));
		list.add(new Employee("ff", 30, 8000));
		list.add(new Employee("bbb", 35, 3000));
	}
	
	/**
	 * collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
		练习1：查找工资大于6000的员工，结果返回为一个List或Set

	 */
	@Test
	public void test3(){
		String[] names ={"xiaocang","xiaoze","zhangsan"};
		List<String> list = Arrays.stream(names)
			.collect(Collectors.toList());//将流中的容器放到一个指定的容器中
		System.out.println(list);
		list.add("xxx");
		System.out.println(list);

		List<String> strings = Arrays.asList(names);
		strings.add("sfadff");
		System.out.println(strings);
	}
	/**
	 *  allMatch(Predicate p)——检查是否匹配所有元素。练习：是否所有的员工的年龄都大于18
		anyMatch(Predicate p)——检查是否至少匹配一个元素。练习：是否存在员工的工资大于 10000
		noneMatch(Predicate p)——检查是否没有匹配的元素。练习：是否存在员工姓“雷”
		findFirst——返回第一个元素
		findAny——返回当前流中的任意元素
		count——返回流中元素的总个数
		max(Comparator c)——返回流中最大值
		练习：返回最高的工资：
		min(Comparator c)——返回流中最小值
		练习：返回最低工资的员工
		forEach(Consumer c)——内部迭代

	 */
	@Test
	public void test(){
		//allMatch(Predicate p)——检查是否匹配所有元素。练习：是否所有的员工的年龄都大于18
		boolean allMatch = list.stream().allMatch(e -> e.getAge() > 20);
		System.out.println(allMatch);
		
		//anyMatch(Predicate p)——检查是否至少匹配一个元素。练习：是否存在员工的工资大于 10000
		boolean anyMatch = list.stream().anyMatch(e -> e.getSalary() > 6000);
		System.out.println(anyMatch);
		
		//noneMatch(Predicate p)——检查是否没有匹配的元素。练习：是否存在员工姓“雷”
		boolean noneMatch = list.stream().noneMatch(e -> e.getName().length() == 100);
		System.out.println(noneMatch);
		
		//findFirst——返回第一个元素
		Optional<Employee> optional = list.stream().findFirst();
		System.out.println(optional.get());
		
		//count——返回流中元素的总个数
		System.out.println(list.stream().count());
		
		//max(Comparator c)——返回流中最大值
//		练习：返回最高的工资：
		Optional<Integer> map = list.stream().max((o1,o2)->o1.getSalary()-o2.getSalary()).map(e -> e.getSalary());
		System.out.println(map.get());
		
	}
	
	/**
	 *  reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T  
		练习1：计算1-10的自然数的和
		reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
		练习2：计算公司所有员工工资的总和

	 */
	@Test
	public void test2(){
		//计算公司所有员工工资的总和
		Optional<Integer> reduce = list.stream()
			.map(e -> e.getSalary())
			.reduce((a,b) -> a + b);
		System.out.println(reduce.get());
		
		System.out.println("-----------------------------");
		
		Integer reduce2 = list.stream()
			.map(e -> e.getSalary())
			.reduce(0,(a,b) -> a + b);
		System.out.println(reduce2);
			
	}
}








