/**
 * 
 */
package com.atguigu.day10OOP.Work1;

/**
   * 项目名称：domo
   *类名称：Kids
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午6:17:05
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
public class Kids extends ManKind{
	private int yearsOld;//子类属性
	
	////子类构造器
	Kids(int sex, int salary) {
		super(sex, salary);
	}
	//子类自定义方法
	public String sayHello() {
		return toString()+"Kids [yearsOld=" + yearsOld + "]";
	}
	//子类自定义方法
	public String printAge() {
		return "yearsOld="+yearsOld;
	}
	
	/*
	 * 	以下getter setter 不赘述
	 * @return
	 */
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}


	
	
	public static void main(String[] args) {
		// (3) 在Kids类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
		Kids someKid = new Kids(25,10000);
		someKid.setSex(1);
//		someKid.setSalary(0);
		someKid.manOrWorman();
		someKid.employeed();
		someKid.setYearsOld(1995);
		System.out.println(someKid.printAge());
		System.out.println(someKid.sayHello());
		
		//(3) 在Kids类的main方法中实例化Kids的对象kids1，用该对象访问本类的成员变量及方法 以及父类的成员变量和方法。
		Kids kids1 = new Kids(30,15000);//初始化对象的salary属性为15000
		kids1.setSalary(0);//调用父类的seter方法重置Salary为0
		kids1.setYearsOld(199509);//调用本类的yearsOld方法设置yearsOld为199509
		kids1.manOrWorman();//调用父类的manOrWorman方法 由于没有设置kids1对象的sex属性 此方法没有输出结果具体看方法实现
		kids1.employeed();////对象的Salary由上一次seter方法设置为0     所以 输出 nojob
		System.out.println(kids1.printAge());//调用本类方法
		System.out.println(kids1.sayHello());//调用本类方法
		
	}
}
