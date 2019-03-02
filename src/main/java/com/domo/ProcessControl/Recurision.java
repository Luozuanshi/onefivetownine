/**
 * 
 */
package com.domo.ProcessControl;

/**
   * 项目名称：domo
   *类名称：Recurision
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日上午10:49:45
   * 类描述：递归
 */
public class Recurision {

	public static void main(String[] args) {
		//使用递归耗时
		long time1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果:%s%n", 30, factorial(13));
        long time2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", time1-time2);  //耗时：32ms
      
        //使用循环迭代耗时
        long d3 = System.currentTimeMillis();
        int a = 13;
        long result = 1;
        while (a > 1) { 
            result *= a * (a - 1);
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.printf("普通循环费时：%s%n", d4 - d3);
    
	}
	/**
	 * 求阶乘的方法
	 * @param n
	 * @return
	 */
	static long factorial(int n) {
		if (n==1) { //递归头：什么时候不调用自身方法。如果没有头，将陷入死循环，也就是递归的结束条件。
			return 1;
		}else { //递归体：怎样调用自身方法
			return n*factorial(n-1);
		}
		
		
		
		
	}
}
