package com.atguigu.day27Lambda.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
	演示
 */

interface Filter{
	boolean filterEmployee(Employee e);
}


public class LambdaTest {

	static ArrayList<Employee> list = new ArrayList<>();
	
	static{
		list.add(new Employee("aaa", 18, 2000));
		list.add(new Employee("ccc", 20, 5000));
		list.add(new Employee("ddd", 25, 6000));
		list.add(new Employee("fff", 30, 8000));
		list.add(new Employee("bbb", 35, 3000));
	}
	
	@Test
	public void test3(){
		//使用StreamAPI和lambda表达式实现获取年纪大于20的员工
		list.stream().filter(x -> x.salary > 5000).forEach(System.out::println);
	}
	
	@Test
	public void test2(){
		//获取年纪大于20的员工
		List<Employee> filterAge = filter(list,new Filter() {//创建的是Filter匿名子类的对象
			
			@Override
			public boolean filterEmployee(Employee e) {
				//获取年纪大于20的员工
				return e.getAge() > 20;
			}
		});
		
		//获取薪水大于5000的员工
		List<Employee> filterSalary = filter(list,new Filter() {
			
			@Override
			public boolean filterEmployee(Employee e) {
				return e.getSalary() > 5000;
			}
		});
		
		for (Employee employee : filterSalary) {
			System.out.println(employee);
		}
	}
	
	public List<Employee> filter(ArrayList<Employee> list,Filter filter){
		List<Employee> list2 = new ArrayList<>(); 
		//校验
		//遍历所有的员工
		for (Employee employee : list) {
			//多态 ： filter的对象是谁那么就调用谁的 filterEmployee方法
			if(filter.filterEmployee(employee)){
				list2.add(employee);
			}
		}
		return list2;
	}
	
	//----------------------------------------------------------------------------------------
	
	@Test
	public void test(){
		//需求 ： 获取员工薪水大于3000以上的所有人
		List<Employee> filterList = filterSalary(list);
		for (Employee employee : filterList) {
			System.out.println(employee);
		}
		
	}
	
	
	
	/**
	 * 过滤薪水大于3000的员工
	 * @param list
	 * @return
	 */
	public List<Employee> filterSalary(ArrayList<Employee> list){
		List<Employee> list2 = new ArrayList<>(); 
		//校验
		//遍历所有的员工
		for (Employee employee : list) {
			if(employee.getSalary() > 3000){
				list2.add(employee);
			}
		}
		return list2;
	}
	
	/**
	 * 过滤年纪大于20岁的员工
	 * @param list
	 * @return
	 */
	public List<Employee> filterAge(ArrayList<Employee> list){
		List<Employee> list2 = new ArrayList<>(); 
		//校验
		//遍历所有的员工
		for (Employee employee : list) {
			if(employee.getAge() > 20){
				list2.add(employee);
			}
		}
		return list2;
	}
	
}








