/**
 * 
 */
package com.atguigu.day10OOP.Circle;

/**
   * 项目名称：domo
   *类名称：Circle
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午4:27:05
   * 类描述
 */
public class Circle {
	private double radius;


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		
		this.radius = radius;
	}
	
	public double findArea() {
		double area =3.14*radius*radius;
		System.out.println(area);
		return area;
	}
}

