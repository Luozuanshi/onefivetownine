/**
 * 
 */
package com.atguigu.day14OOP.Work2;

/**
   * 项目名称：domo
   *类名称：MyDate
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午8:20:47
   * 类描述
 */
public class MyDate {
	private int month;
	private int day;
	private int years;
	private static MyDate currentSalaryMonthday =new MyDate(9,1,2019);
	
	
	public MyDate(int month, int day, int years) {
		super();
		this.month = month;
		this.day = day;
		this.years = years;
	}

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}

	public static MyDate getCurrentmonthday() {
		return currentSalaryMonthday;
	}

	public static void setCurrentmonthday(MyDate currentmonthday) {
		MyDate.currentSalaryMonthday = currentmonthday;
	}

	public String toString() {
		return years+"年"+month+"月"+day+"日";
	}
	
	
}
