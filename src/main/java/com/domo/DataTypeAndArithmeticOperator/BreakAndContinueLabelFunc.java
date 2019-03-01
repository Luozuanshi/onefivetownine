/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：BreakAndContinueLabelFunc
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午11:19:49
   * 类描述:带标签的break和continue
 */
public class BreakAndContinueLabelFunc {
	  public static void main(String args[]) {
		  	//求101-150之间的质数
	        outer: for (int i = 101; i < 150; i++) {
	            for (int j = 2; j < i / 2; j++) {
	                if (i % j == 0){
	                    continue outer;
	                }
	            }
	            System.out.print(i + "  ");
	        }
	    }
}
