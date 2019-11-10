/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：ArithmeticOperatorIncreaseAndDecrease
 * @author Administrator
 * @version 1.0
   * 创建时间2019年11月10日上午11:31:50
   * 类描述 ：算术运算 自增增减  
 */
public class ArithmeticOperatorIncreaseAndDecrease {
	public static void main(String[] args) {
			int i1=10;
			int i2=20;
			
			int i=i1++;
			System.out.println("i = "+i); //i=10
			System.out.println("i1 =l "+i1);//i=11
			i = ++i1;
			System.out.println("i = "+i);//12
			System.out.println("i1 = "+i1);//12
			i = i2--;
			System.out.println("i = "+i);//20
			System.out.println("i2 = "+i2);//19
			i = --i2;
			System.out.println("i = "+i);//18
			System.out.println("i2 = "+i2);//18
			
	}
}
