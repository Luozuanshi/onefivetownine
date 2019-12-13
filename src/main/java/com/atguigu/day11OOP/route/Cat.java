/**
 * 
 */
package com.atguigu.day11OOP.route;

/**
   * 项目名称：domo
   *类名称：Cat
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月13日下午7:02:33
   * 类描述
 */
public class Cat extends Animal{
	
	@Override
	public void say() {
		System.out.println("我是"+getName()+"，大家好");
	}
}
