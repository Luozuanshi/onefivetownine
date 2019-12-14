/**
 * 
 */
package com.atguigu.day11OOP.route;

/**
   * 项目名称：domo
   *类名称：Dog
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月13日下午7:02:25
   * 类描述
 */
public class Dog extends Animal{
	private String name;
	
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}



	@Override
	public void say() {
		System.out.println("本类的name为="+this.name);
		System.out.println("父类的name为 ="+getName());
	}


//	public void setName(String name) {
//		this.name = name;
//	}
	
	
}
