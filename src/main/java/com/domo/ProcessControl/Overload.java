/**
 * 
 */
package com.domo.ProcessControl;

/**
   * 项目名称：domo
   *类名称：Overload
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日上午10:11:52
   * 类描述：方法的重载
 */
public class Overload {

	public static void main(String[] args) {
		/*
		 * 1.不同的含义：形参类型、形参个数、形参顺序不同
		 * 
		 * 2.只有返回值不同不构成方法的重载
		 * 
		 * 3.只有形参的名称不同，不构成方法的重载
		 */
		
		
	}
	/**
	 * 求和的方法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add (int a ,int b) {
		return a+b;
	}
	
	// 方法名相同，参数个数不同，构成重载
	public static int add(int a, int b ,int c) {
		return a+b+c;
	}
	// 方法名相同，参数类型不同，构成重载
	public static double add(double a,int b) {
		return a+b;
	}
	// 方法名相同，参数类型顺序不同，构成重载
	public static double add(int a ,double b) {
		return a+b;
	}
	
	/*//编译错误：只有返回值不同，不构成方法的重载
	public static double add(int a,int b) {
		return a+b;
	}
	
	 //编译错误：只有参数名称不同，不构成方法的重载
	public static int add(int a1,int b1) {
		return a+b1;
	}*/
}
