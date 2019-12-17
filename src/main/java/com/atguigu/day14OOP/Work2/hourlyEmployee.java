/**
 * 
 */
package com.atguigu.day14OOP.Work2;

/**
   * 项目名称：domo
   *类名称：hourlyEmployee
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午8:30:20
   * 类描述
 */
public class hourlyEmployee extends Employee{
	private double wage;
	private double hour;
	private double monthySalary;
	
	public hourlyEmployee(String name, int number, MyDate brithday, double wage, double hour) {
		super(name, number, brithday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public double earnings() {
		MyDate currentmonthday = MyDate.getCurrentmonthday();
		if(currentmonthday.getMonth() ==this.getBrithday().getMonth()) {
			monthySalary += 100;
		}
		monthySalary += (wage*hour);
		return monthySalary;
	}

	@Override
	public String toString() {
		return "hourlyEmployee [wage=" + wage + ", hour=" + hour + ", monthySalary=" + monthySalary + ", toString()="
				+ super.toString() + "]";
	}


	
	
}
