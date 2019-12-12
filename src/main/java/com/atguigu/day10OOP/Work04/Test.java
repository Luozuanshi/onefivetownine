/**
 * 
 */
package com.atguigu.day10OOP.Work04;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午9:30:05
  * 类描述 : 设计父类—员工类。子类：工人类,农民类,教师类,科学家类,服务生类。（10分）
（1）其中工人,农民,服务生只有基本工资。（10分）
（2）教师除基本工资外,还有课酬(元/天)。（10分）
（3）科学家除基本工资外,还有年终奖。（10分）
（4）编写一个测试类,将各种类型的员工的全年工资打印出来。（10分）
 */
public class Test {
	public static void main(String[] args) {
		//测试老师类
		Teacher teacher = new Teacher(120, 300,10);
		System.out.println("老师："+teacher.showSalary());//显示老师的全年课酬
		System.out.println("老师的每天课酬："+teacher.getDollars());//显示老师的每天课酬
		
		//测试科学家类
		Scientist scientist = new Scientist(500, 200);
		scientist.setYearEndDollars(500000);
		System.out.println("科学家："+scientist.showSalary());
		System.out.println("科学家年终奖：" + scientist.getYearEndDollars());
		
		//测试服务生
		Waiter waiter = new Waiter(80,300);
		System.out.println("服务生："+waiter.showSalary());

		//测试农名
		Peasant peasant = new Peasant(50,365);
		System.out.println("农名："+peasant.showSalary());

		//测试工人
		Worker worker = new Worker(330,345);
		System.out.println("工人："+worker.showSalary());
		
	}
}
