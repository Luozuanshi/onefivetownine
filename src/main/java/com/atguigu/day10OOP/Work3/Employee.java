/**
 * 
 */
package com.atguigu.day10OOP.Work3;

/**
   * 项目名称：domo
   *类名称：Employee
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午7:24:43
   * 类描述	父类：员工类
	子类：部门经理类、普通员工类
	部门经理工资=1000+单日工资*天数*等级（1.2）。
	普通员工工资=单日工资*天数*等级（1.0）；
	（1）员工属性：姓名，单日工资，工作天数（10分）
	（2）员工方法（打印工资）（10分）
	（3）普遍员工及部门经理都是员工子类，需要重写打印工资方法。（20分）
	（4）定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资（10分）
 */
public class Employee {
	
	private String name;
	private double singleSalary;
	private double workDay;
	private double totleSalary;
	
	public double calcSalary() {
		totleSalary = singleSalary*workDay;
		return totleSalary;
	}
	
	public String showSalary() {
		return "name = "+name +" singleSalary = "+singleSalary + " workDay = "+workDay + " totleSalary = " + totleSalary ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSingleSalary() {
		return singleSalary;
	}

	public void setSingleSalary(double singleSalary) {
		this.singleSalary = singleSalary;
	}

	public double getWorkDay() {
		return workDay;
	}

	public void setWorkDay(double workDay) {
		this.workDay = workDay;
	}

	public double getTotleSalary() {
		return totleSalary;
	}

	public void setTotleSalary(double totleSalary) {
		this.totleSalary = totleSalary;
	}
	
	
	
}
