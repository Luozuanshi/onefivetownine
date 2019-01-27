/**
 * 
 */
package com.domo.DataTypeAndArithmeticOperator;

/**
   * 项目名称：domo
   *类名称：PrimitiveChar
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午10:58:49
   * 类描述：char 数据类型 ,在内存中占2个字节 ，boolean在字节中占1位
 */
public class PrimitiveCharAndBoolean {
	public static void main(String[] args) {
		char a = 'D';
		char b = '多';
		char c ='\u0064';
		System.out.println(c);
		
		
		//转义字符
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\"'+'\t'+'\''+'b');
		
		boolean isMan = true;
		if (isMan) {
			System.out.println("男性");
		}
	}
}
