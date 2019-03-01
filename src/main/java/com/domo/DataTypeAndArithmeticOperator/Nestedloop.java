/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：demo
   *类名称：Nestedloop
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午9:20:36
   * 类描述:嵌套循环
 */
public class Nestedloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//输出内容
//		1	1	1	1	1	
//		2	2	2	2	2	
//		3	3	3	3	3	
//		4	4	4	4	4	
//		5	5	5	5	5	
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		//九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
//		  1. 用while循环分别计算100以内的奇数及偶数的和，并输出。
		int sum0=0;
		int sum1=0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				sum0+=i;
			}else {
				sum1+=i;
			}
		}
		System.out.println("偶数和:"+sum0+"\t奇数和:"+sum1);
		
//	      2. 用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。
		for (int i = 1; i <= 1000; i++) {
			if (i%5==0) {
				System.out.print(i+"\t");
			}
			if (i%25==0) {
				System.out.println();
			}
		}
		
		
	}

}
