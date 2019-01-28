/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：LogicalOpertion
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月28日下午8:15:16
   * 类描述:逻辑运算
 */
public class LogicalOpertion {
	public static void main(String[] args) {
//		短路与	&&( 与)	只要有一个为false，则直接返回false   有假为假
//		短路或	||(或)	只要有一个为true， 则直接返回true     有真则真
		
		//1>2的结果为false，那么整个表达式的结果即为false，将不再计算2>(3/0)
		boolean c = 1>2 && 2>(3/0);
		System.out.println(c);
		//1>2的结果为false，还要计算2>(3/0)，0不能做除数，//会输出异常信息 java.lang.ArithmeticException: / by zero
		boolean d = 1>2 && 2>(3/0);
		System.out.println(d);
		
		//2==2的结果为true，那么整个表达式的结果即为true，将不再计算2>(3/0)
		boolean f = 2==2 || 2>(3/0);
		System.out.println(c);
		//2==2的结果为true，还要计算2>(3/0)，0不能做除数，//会输出异常信息 java.lang.ArithmeticException: / by zero
		boolean g = 2==2 | 2>(3/0);
		System.out.println(d);
	}
}
