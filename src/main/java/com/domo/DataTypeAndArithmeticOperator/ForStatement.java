/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：ForStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午8:41:04
   * 类描述:for循环语句
 */
public class ForStatement {
	
	
    public static void main(String[] args) { 
    	
    	  int sum = 0;
          //1.求1-100之间的累加和
          for (int i = 0; i <= 100; i++) {
              sum += i;
          }
          System.out.println("Sum= " + sum);
          //2.循环输出9-1之间的数
          for(int i=9;i>0;i--){
              System.out.print(i+"、");
          }
          System.out.println();
          //3.输出90-1之间能被3整除的数
          for(int i=90;i>0;i-=3){
              System.out.print(i+"、");
          }
          System.out.println();
    	
    	//逗号运算符　
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j); 
        }
        
        
        /**
         * 1.执行初始化:int i =0, sum =0;
         * 2.判断i<=100
         * 3.执行循环体
         * 4.步进:sum+=i,i++
         * 5.循环判断
         */
        for(int i =0, sum1 =0; i <=100; sum1+=i,i++) 
        { System.out.println(sum1); }
    }
    
}
