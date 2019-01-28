package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：RelationoOperator
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月28日下午7:39:56
   * 类描述:关系运算符
 */
public class RelationoOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max =3;
		System.out.println(max==3);
		System.out.println(max!=3);//String literal is not properly(正确) closed by a double-quote(双引号)
		
		//char 类型也可以进行关系运算
		char aChar ='a';
		char bChar ='b';
		
		System.err.println(aChar+"\t"+bChar);
		System.out.println((int)aChar);//强制转换
		System.out.println(0+bChar);//类型自动转换
		System.out.println(aChar>bChar);//进行的是数值比较
	}

}
