/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：ArithmeticOperator
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午11:30:53
   * 类描述:算数运算符 i++,i++的区别
 */
public class ArithmeticOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = a++;   //执行完后,b=3。先给b赋值，再自增。
		System.out.println("a="+a+"\tb="+b);
		a = 3;
		b = ++a;   //执行完后,c=5。a先自增，再给c赋值
		System.out.println("a="+a+"\tb="+b);
		
		//扩展运算符
		int a1=3;
		int b1=4;
		a1+=b1;//相当于a=a+b;
		System.out.println("a="+a1+"\nb="+b1);
		a1=3;
		a1*=b1+3;//相当于a=a*(b+3)
		System.out.println("a="+a1+"\nb="+b1);	}

}
