package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：TypeConversion
 * @author Administrator
 * @version 1.0
   * 创建时间2019年2月19日上午9:05:10
   * 类描述：自动类型转换，强制类型转换
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
		
		
		int money = 1000000000; //10亿
		int years = 20;
		//返回的total是负数，超过了int的范围
		int total = money*years;
		System.out.println("total="+total);
		//返回的total仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生//了数据丢失
		long total1 = money*years; 
		System.out.println("total1="+total1);
		//返回的total2正确:先将一个因子变成long，整个表达式发生提升。全部用long来计算。
		long total2 = money*((long)years); 
		System.out.println("total2="+total2);
	}

}
