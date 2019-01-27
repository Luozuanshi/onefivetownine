/**
 * 
 */
package com.domo.DefinevariableIdentif;

import java.math.BigDecimal;

/**
   * 项目名称：domo
   *类名称：PrimitiveFloatDouble
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午9:59:20
   * 类描述:基本数据类型-浮点类型计算
 */
public class PrimitiveFloatDouble {
	public static void main(String[] args) {
		float ff =3.14F;//float类型赋值时需要添加后缀F/f
		double f1 =3.14;
		double f2 = 314e2;  //314*10^2-->31400.0
		double f3 = 314e-2; //314*10^(-2)-->3.14
		System.out.println(f2+";"+f3);
		
		//浮点类型float，double的数据不适合在不容许舍入误差的金融计算领域。如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类。
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);//结果为false
		
		float d1 = 423432423f;
		float d2 = d1+3;
		if(d1==d2){
		   System.out.println("d1==d2");//输出结果为d1==d2
		}else{
		    System.out.println("d1!=d2");
		}
		
		/*使用BigDecimal进行浮点数的比较
		浮点数存在舍入误差，数字不能精确表示。如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类。
		*/
		 BigDecimal bd = BigDecimal.valueOf(1.0);
	        bd = bd.subtract(BigDecimal.valueOf(0.1));
	        bd = bd.subtract(BigDecimal.valueOf(0.1));
	        bd = bd.subtract(BigDecimal.valueOf(0.1));
	        bd = bd.subtract(BigDecimal.valueOf(0.1));
	        bd = bd.subtract(BigDecimal.valueOf(0.1));
	        System.out.println(bd);//0.5
	        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//0.5000000000000001
		
	      BigDecimal bd1 =BigDecimal.valueOf(0.1); 
	      BigDecimal bd2 =BigDecimal.valueOf(1.0/10);
	      
	      System.out.println(bd1.equals(bd2));
	      System.out.println(bd1==bd2);
	}
}
