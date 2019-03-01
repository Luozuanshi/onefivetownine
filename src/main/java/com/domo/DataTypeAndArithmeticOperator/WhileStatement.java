/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：WhileStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午8:26:23
   * 类描述:while语句
 */
public class WhileStatement {

	public static void main(String[] args) {

		//计算1+2+3+4+5+....+100的和等于505
		int i =1;
		int sum =0;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
