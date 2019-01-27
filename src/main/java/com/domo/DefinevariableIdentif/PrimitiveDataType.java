package com.domo.DefinevariableIdentif;

/**
   * 项目名称：domo
   *类名称：PrimitiveDataType
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午9:17:12
   * 类描述:基本数据类型及范围
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		//不同进制的表现形式
		int a = 16;
		int b =016;
		int c =0x16;
		int d =0b1111;//Binary literals(字面值) can only be used with source level 1.7 or greater(较大的)
		System.out.println(a+";"+b+";"+c+";"+d);
		
		//四个基本数据类型及范围
		byte age = 30;//-128-127;
		short salary = 30000;//-30000-30000
		int population = 210000000;//-210000000-210000000
		long money = 6500000000000L;//默认是int 类型表示,需要数字后面加L表示long类型
		
		
	}
}
