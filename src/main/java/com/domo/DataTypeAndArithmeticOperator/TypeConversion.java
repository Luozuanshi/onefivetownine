package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：TypeConversion
 * @author Administrator
 * @version 1.0
   * 创建时间2019年2月19日上午9:05:10
   * 类描述：自动类型转换
 */
public class TypeConversion {

	public static void main(String[] args) {
		// 由容量小的自动转换成容量大的
		//int 类型可以直接转换成float double 类型
		int a = 1234;
		double b = a;
		//long 类型可以直接转换成float double 类型
		long c =123456789;
		float d =c ;
		
		//特例
		//默认int类型只要不超出数值范围，都可以自动转换short(正负3万左右) byte（-128到128） 
		byte e =123;
		short f =30000;
	}

}
