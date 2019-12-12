/**
 * 
 */
package com.atguigu.day10OOP.Work05;

/**
   * 项目名称：domo
   *类名称：Picture
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日上午11:17:22
   * 类描述 七 定义一个图形类Picture，再定义Picture的两个子类：圆形类Circle、矩形类Rect。（10分）
   要求：
图像类：有求周长和求面积和显示图形信息的功能。（10分）
圆形类：包含圆心和半径，重写求面积和求体积的方法。（15分）
矩形类：包含长和宽，重写面积和求体积的方法。（15分）
 */
public class Picture {
	private double heigth;
	private double area;
	private double permiter;
	
	public double findArea() {
		return 0.0;
	}
	
	public double findVolume() {
		return 0.0;
	}
	
	public void show() {
		
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	
	
}
