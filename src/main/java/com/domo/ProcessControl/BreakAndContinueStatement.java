/**
 * 
 */
package com.domo.ProcessControl;

/**
   * 项目名称：domo
   *类名称：BreakAndContinueStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午10:33:47
   * 类描述:break语句和continue语句
   * break跳出结束整个循环语句;continue跳出本次循环体执行下一次循环
 */
public class BreakAndContinueStatement {

	public static void main(String[] args) {
		//break语句
	    int total = 0;//定义计数器
        System.out.println("Begin");
        while (true) {
            total++;//每循环一次计数器加1
            int i = (int) Math.round(100 * Math.random());
            //当i等于88时，退出循环
            if (i == 88) {
                break;
            }
        }
        //输出循环的次数
        System.out.println("Game over， used " + total + " times.");
        
        //continue语句
        int count = 0;//定义计数器
        for (int i = 100; i < 150; i++) {
            //如果是3的倍数，则跳过本次循环，继续进行下一次循环
            if (i % 3 == 0){
                continue;
            }
            //否则（不是3的倍数），输出该数
            System.out.print(i + "、");
            count++;//没输出一个数，计数器加1
            //根据计数器判断每行是否已经输出了5个数
            if (count % 5 == 0) {
                System.out.println();
            }
        }
	}

}
