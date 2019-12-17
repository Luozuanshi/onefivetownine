/**
 * 
 */
package com.atguigu.day14OOP.Work;

/**
   * 项目名称：domo
   *类名称：Person
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午7:05:29
   * 类描述	1：按要求实现下列问题：实现一个名为Person的类(抽象)和它的子类Employee，Employee有两个子类Faculty和Staff。具体要求如下：
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
abstract public class Person {
	private String name;
	private String Address;
	
	
	public Person(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}


	@Override
	public String toString() {
		return " name=" + name + ", Address=" + Address + "";
	}


	public static void main(String[] args) {
		Person p1 = new Faculty("张三", "北京", 100000, "20191117","一等");
		Faculty f = (Faculty)p1;
		f.setDegree("本科");;
		
		Person p2 = new Staff("李四", "上海", 100001, "20191118", "职员");
		
		Person[] pArr =new Person[2];
		pArr[0] = p1;
		pArr[1] = p2; 
		
		for (int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Faculty) {
				System.out.println(((Faculty)pArr[i]));
			}else if (pArr[i] instanceof Staff) {
				System.out.println(pArr[i]);
			}
		}
		
	}
}
