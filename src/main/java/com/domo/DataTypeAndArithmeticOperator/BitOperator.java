/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：BitOperator
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月29日上午12:08:38
   * 类描述:位运算
 */
public class BitOperator {
	public static void main(String[] args) {
		
		//变量的二进制补码
		int max = 4;//0b4 - Invalid binary literal number (only '0' and '1' are expected)
		int min = 3; 
		System.out.println(max&min);//位与 :max与min将两个数据转化为二进制数,然后按位进行与运算，有0为0; 特别提醒：负数按补码形式参加按位与运算。
		System.out.println(max|min);//位与 :max与min将两个数据转化为二进制数,然后按位进行或运算，有1为1; 特别提醒：负数按补码形式参加按位与运算。
		System.out.println(max^min);//位异或:max与min将两个数据转化为二进制数,然后按位进行异或运算，有1为1,全0为0；; 特别提醒：负数按补码形式参加按位与运算。
		System.out.println(~max);//取反
		
		//以两倍递增或递减的场景下可以使用
		int a = 3*2*2;
		int b = 3<<2; //相当于：3*2*2;
		int c = 12/2/2;
		int d = 12>>2; //相当于12/2/2;
		
		System.out.println(a+" "+d);
	}
}
