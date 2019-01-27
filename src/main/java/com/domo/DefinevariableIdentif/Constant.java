package com.domo.DefinevariableIdentif;

/**
   * 项目名称：domo
   *类名称：Constant
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午8:54:51
   * 类描述:常量
 */
public class Constant {
	public static void main(String[] args) {
		final String name = "pangluo";
//		name="haha";The final local variable name cannot be assigned. It must be blank and not using a compound assignment
		
		final double PI=3.14156926;
		double r=4;
		double area=PI*r*r;
		double circle=2*PI*r;
		System.out.println(area+";" +circle);
	}
}
