/**
 * 
 */
package com.atguigu.day14OOP.Work2;

/**
   * 项目名称：domo
   *类名称：SalariedEmployee
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午8:24:57
   * 类描述
 */
public class SalariedEmployee extends Employee{
	private double monthySalary;
	
	public SalariedEmployee(String name, int number, MyDate brithday, double monthySalary) {
		super(name, number, brithday);
		this.monthySalary = monthySalary;
	}

	@Override
	public double earnings() {
		MyDate currentmonthday = MyDate.getCurrentmonthday();
		if(currentmonthday.getMonth() ==this.getBrithday().getMonth()) {
			monthySalary += 100;
		}
		return monthySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthySalary=" + monthySalary + ", toString()=" + super.toString() + "]";
	}
	

}
