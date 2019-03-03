/**
 * 
 */
package com.domo.OOP.advance;

/**
   * 项目名称：domo
   *类名称：Instanceof
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月3日下午11:40:09
   * 类描述:继承extend及instanceof
 */
public class Instanceof {
	public static void main(String[] args) {
		student student1 = new student();
		student student2 = new student("pangluo", 172, "挖掘机专业");
		Person person1 =new Person();
		//子类继承父类拥有父类的方法
		student1.rest();
		//子类继承父类拥有父类的属性
		System.out.println(student2.height);
		
		//instanceof是二元运算符，左边是对象，右边是类；当对象是右面类(或子类)所创建对象时，返回true；否则，返回false。比如：
		System.out.println(student2 instanceof student);
		System.out.println(student2 instanceof Person);
		System.out.println(student2 instanceof Object);
		System.out.println(person1 instanceof student);
		
	}
}

class Person {
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会儿");
	}
}

/**
 * 子类继承父类拥有父类的属性和方法
 */
class student extends Person {
	String major;
	
	public void study() {
		System.out.println("只想读书学习");
	}
	/**
	 * 有参构造
	 */
	public student(String name,int height,String major) {
		this.name =name;
		this.height=height;
		this.major=major;
	}
	/**
	 * 无参构造
	 */
	public student() {
		
	}
}