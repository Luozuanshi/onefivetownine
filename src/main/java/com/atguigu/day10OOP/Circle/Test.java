/**
 * 
 */
package com.atguigu.day10OOP.Circle;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午4:31:31
   * 类描述
 */
public class Test {
	public static void main(String[] args) {		
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(4);
		cylinder.findArea();
		cylinder.setLength(5);
		cylinder.findVolume();
	}
}
