/**
 * 
 */
package com.domo.OOP;

/**
   * 项目名称：domo
   *类名称：Construct
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日下午3:19:16
   * 类描述：构造方法
   * 把一个点的坐标抽象成对象
   * 使用Construct 初始化成员， getDistance计算两点间距离
 */
public class Construct {
	double x;
	double y;
	
	/**
	 * 有参数的构造方法，初始化成员变量
	 * @param x_1
	 * @param y_2
	 */
	Construct(Double x_1,Double y_1){
		x=x_1;
		y=y_1;
	}
	/**
	 * 计算两点间距离
	 * @param p 需要传一个Construct对象
	 * @return
	 */
	public double getDistance(Construct p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
	
	public static void main(String[] args) {
		
		Construct c =new Construct(3.0, 4.0); //对象，点c
		Construct b =new Construct(1.0, 0.0); //对象，点b
		System.out.println(c.getDistance(c)); 
		
	}

}
