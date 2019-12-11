/**
 * 
 */
package com.atguigu.day10OOP.Work3;

/**
   * 项目名称：domo
   *类名称：Manager
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午7:25:38
   * 类描述	父类：员工类
	子类：部门经理类、普通员工类
	部门经理工资=1000+单日工资*天数*等级（1.2）。
	普通员工工资=单日工资*天数*等级（1.0）；
	（1）员工属性：姓名，单日工资，工作天数（10分）
	（2）员工方法（打印工资）（10分）
	（3）普遍员工及部门经理都是员工子类，需要重写打印工资方法。（20分）
	（4）定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资（10分）
 */
public class Manager extends Employee {
	private double salarylevel;
	
	public Manager(double salarylevel) {
		super();
		this.salarylevel = salarylevel;
	}

	@Override
	public double calcSalary() {
		double totleSalary = super.calcSalary()*salarylevel+1000;
		this.setTotleSalary(totleSalary);
		return getTotleSalary();
	}

	public String showSalary() {
		return "经理工资:"+super.showSalary()+"工资等级:"+salarylevel;
	}
}
