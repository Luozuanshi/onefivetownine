/**
 * 
 */
package com.atguigu.day10OOP.Work04;

/**
   * 项目名称：domo
   *类名称：Scientist
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午8:44:36
  * 类描述 : 设计父类—员工类。子类：工人类,农民类,教师类,科学家类,服务生类。（10分）
（1）其中工人,农民,服务生只有基本工资。（10分）
（2）教师除基本工资外,还有课酬(元/天)。（10分）
（3）科学家除基本工资外,还有年终奖。（10分）
（4）编写一个测试类,将各种类型的员工的全年工资打印出来。（10分）
 */
public class Scientist extends Employee {

	public Scientist(double salary, int workDay) {
		super(salary, workDay);
	}
	
	
}
