/**
 * 
 */
package com.atguigu.day10OOP.Work05;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日上午11:38:15
   * 类描述
 */
public class Test {
	public static void main(String[] args) {
		//测试圆类
		Circle circle = new Circle();
		circle.setHeigth(10);
		circle.setRadius(2);
		System.out.println(circle.findArea());
		System.out.println(circle.findVolume());
		
		//new 的对象具有独立的父类的属性，多个对象哥哥属性不影响各自的属性不受影响
		Circle circle1 = new Circle();
		circle1.setHeigth(9);
		circle1.setRadius(1);
		System.out.println(circle1.findArea());
		System.out.println(circle1.findVolume());
		
		//测试矩形类
		Rect rect = new Rect(10,20);//初始化
		rect.setHeigth(20);//设置高
		System.out.println(rect.findArea());//面积
		System.out.println(rect.findVolume());//体积
		
		//new 的对象具有独立的父类的属性，多个对象哥哥属性不影响各自的属性不受影响
		Circle circle2 = new Circle();
		circle2.setHeigth(90);
		circle2.setRadius(10);
		System.out.println(circle2.findArea());
		System.out.println(circle2.findVolume());
	}
}
