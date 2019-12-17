/**
 * 
 */
package com.atguigu.day14OOP.Work2;

/**
   * 项目名称：domo
   *类名称：PayrollSystem
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午8:32:54
   * 类描述
 */
public class PayrollSystem {
	private static Employee[] emp = new Employee[2];
	public static void main(String[] args) {
		MyDate BrithDay = new MyDate(9, 2, 2019);
		
		emp[0] = new SalariedEmployee("张三", 1,BrithDay, 10000);
		
		emp[1] = new hourlyEmployee("李四", 2, BrithDay, 100, 240);
		
		System.out.println(BrithDay);
		
		for (int i = 0; i < emp.length; i++) {
			if(emp[i] instanceof SalariedEmployee) {
				emp[i].earnings();
				System.out.println(emp[i]);
			}
			if(emp[i] instanceof hourlyEmployee) {
				emp[i].earnings();
				System.out.println(emp[i]);
			}
			
			
		}
		
	}
}
