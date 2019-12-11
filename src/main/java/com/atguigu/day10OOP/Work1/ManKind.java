/**
 * 
 */
package com.atguigu.day10OOP.Work1;

/**
   * 项目名称：domo
   *类名称：Day10Work
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午6:10:44
   * 类描述 		继承和构造器、封装的题目（选做3题即可）
三、定义一个ManKind类，包括
成员变量int sex和int salary；
方法void manOrWorman()：根据sex的值显示“man”(sex==1)或者“women”(sex==0)；
方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。 
Y要求加上两个参数有参构造
   (2)定义类Kids继承ManKind，并包括
成员变量int yearsOld；
方法printAge()打印yearsOld的值。
   (3)在Kids类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。

 */
public class ManKind {
	private int sex;//父类属性
	private int salary;
	//父类构造器
	ManKind(int sex,int salary){
		this.sex = sex;
		this.salary =salary;
	}
	//父类自定义方法
	public void manOrWorman() {
		//根据sex的值显示“man”(sex==1)或者“women”(sex==0);
		if(sex==1) {
			System.out.println("man");
		}else if(sex==0) {
			System.out.println("women");
		}
		
	}
	//父类自定义方法
	public void employeed() {
		//根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0);
		if(salary==0) {
			System.out.println("no job");
		}else {
			System.out.println("job");
		}
	}

	/*
	 * 	以下getter setter 不赘述
	 * @return
	 */
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "ManKind [sex=" + sex + ", salary=" + salary + "]";
	}
	
	
}
