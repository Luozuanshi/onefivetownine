package com.atguigu.day27Lambda.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * lambda格式：
 * 
 * -> : lambda操作符（箭头操作符）
 * 箭头操作符的左边 ：形参
 * 箭头操作符的右边　：　方法体（lambda体）
 * 
 * 说明：
 * 	  1.lambda表达式是对匿名内部类（①必须是接口的实现类的对象  ②只能有一个抽象方法）对象的一种简写方式。
 */
public class LambdaTest2 {
	static ArrayList<Employee> list = new ArrayList<>();

	static {
		list.add(new Employee("aaa", 18, 2000));
		list.add(new Employee("ccc", 20, 5000));
		list.add(new Employee("ddd", 25, 6000));
		list.add(new Employee("fff", 30, 8000));
		list.add(new Employee("bbb", 35, 3000));
	}
	
	@Test
	public void test(){
		filter(list,new Filter() {
			
			@Override
			public boolean filterEmployee(Employee e) {
				return e.age > 20;
			}
		});
		
		//--------------------------------
		
		
		filter(list,(Employee e) ->{
			return e.age > 20;
		});
	}

	public List<Employee> filter(ArrayList<Employee> list, Filter filter) {
		List<Employee> list2 = new ArrayList<>();
		// 校验
		// 遍历所有的员工
		for (Employee employee : list) {
			// 多态 ： filter的对象是谁那么就调用谁的 filterEmployee方法
			if (filter.filterEmployee(employee)) {
				list2.add(employee);
			}
		}
		return list2;
	}
}
