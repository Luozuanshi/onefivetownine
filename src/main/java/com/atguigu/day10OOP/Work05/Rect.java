/**
 * 
 */
package com.atguigu.day10OOP.Work05;

/**
   * 项目名称：domo
   *类名称：Rect
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日上午11:18:01
   * 类描述 七 定义一个图形类Picture，再定义Picture的两个子类：圆形类Circle、矩形类Rect。（10分）
   要求：
图像类：有求周长和求面积和显示图形信息的功能。（10分）
圆形类：包含圆心和半径，重写求周长和求面积的方法。（15分）
矩形类：包含长和宽，重写求周长和求面积的方法。（15分）
 */
public class Rect extends Picture{
	private double length;
	private double width;
	
	public Rect(double length, double width ) {
		super();
		this.length = length;
		this.width = width;
	}

	public double findArea() {
		return length*width;
	}
	
	public double findVolume() {
		return length * width * getHeigth();
	}

}
