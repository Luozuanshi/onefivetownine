/**
 * 
 */
package com.atguigu.day14OOP.Work;

/**
   * 项目名称：domo
   *类名称：Faculty
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午7:06:12
   * 类描述 1：按要求实现下列问题：实现一个名为Person的类(抽象)和它的子类Employee，Employee有两个子类Faculty和Staff。具体要求如下：
1）Person类中的属性有：姓名name（String类型），地址address（String类型），
；
2）Employee类中的属性有：办公室office（String类型，静态修饰），工资wage（double
类型），受雇日期hiredate（String类型），公司（final修饰，String compamy属性）
初始化块中为公司赋值：XX大公司



3）Faculty类中的属性有：学位degree（String类型，静态修饰），级别level（String类型）；
4）Staff类中的属性有：职务称号duty（String类型）。
5）现有对象Person p1 =new Faculty()和Person p2 =new Staff ()，请分别为p1的属性赋值“本科”和Staff类的duty赋值“职员”
将p1和p2 都放在Person数组，中，循环打印里面的属性信息！
 */
public class Faculty extends Employee {
	/**
	 * @param name
	 * @param address
	 * @param wage
	 * @param hiredate
	 * @param company
	 */
	public Faculty(String name, String address, double wage, String hiredate,String level) {
		super(name, address, wage, hiredate);
		this.level =level;
	}
	private static String degree;
	private	String level;
	
	public static String getDegree() {
		return degree;
	}
	public static void setDegree(String degree) {
		Faculty.degree = degree;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Faculty [level=" + level +" degree="+  degree+"," + super.toString() +"]  ";
	}
	
	
	
	
}
