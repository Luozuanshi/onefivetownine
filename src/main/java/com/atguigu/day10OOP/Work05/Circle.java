/**
 * 
 */
package com.atguigu.day10OOP.Work05;

/**
   * 项目名称：domo
   *类名称：Circle
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日上午11:17:49
   * 类描述 七 定义一个图形类Picture，再定义Picture的两个子类：圆形类Circle、矩形类Rect。（10分）
   要求：
图像类：有求周长和求面积和显示图形信息的功能。（10分）
圆形类：包含圆心和半径，重写求周长和求面积的方法。（15分）
矩形类：包含长和宽，重写求周长和求面积的方法。（15分）
 */
public class Circle extends Picture{
	private double radius;
	
	public double findArea() {
		return Math.PI * radius *radius;
	}
	
	public double findVolume() {
		return findArea()*getHeigth();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	
}
