/**
 * 
 */
package com.atguigu.day10OOP.Circle;

/**
   * 项目名称：domo
   *类名称：Cylinder
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午4:27:43
   * 类描述
 */
public class Cylinder extends Circle{
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		double volume = findArea()*length;
		System.out.println(volume);
		return volume;
	}
	
}
