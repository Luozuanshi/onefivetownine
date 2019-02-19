/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：TernaryOperator
 * @author Administrator
 * @version 1.0
   * 创建时间2019年2月7日下午10:51:25
   * 类描述:三目运算符,条件判断 
 */
public class TernaryOperator {
	public static void main(String[] args) {
		int score = 80;
		//三目运算
		String type =score<60?"不及格":"及格";//条件为真取值第一个,条件为假取第二个
		System.out.println(type);
		
		//条件运算
		if (score<60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		
		//
		int x=-100;
		System.out.println(x>0?1:(x==0?0:-1));
	}
}
