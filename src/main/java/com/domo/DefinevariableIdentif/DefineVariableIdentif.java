
package com.domo.DefinevariableIdentif;

/**
   * 项目名称：domo
   *类名称：VariableIdentif
 * @author Administrator
 * @version 1.0
   * 创建时间2019年1月27日下午3:59:49
   * 类描述:变量的命令规则,变量的定义,变量的初始化，变量的作用域
 */
public class DefineVariableIdentif {
	int box;//成员变量，从属于对象,成员变量会被自动初始化
	static int sendbox;//静态变量，从属于类
	public static void main(String[] args) {
		//可以使用中文
		String 你好="nihao";
		//可以使用下划线
		double _pi =3.1415926;
		//可以使用$
		int $age =18;
		
		//不可以使用数字开头
//		int 123fixed = 13;Syntax error on token "123f", delete this token
		
		//同时定义多个变量
		int max,min,hello;
//		System.out.println(max);The local variable max may not have been initialized
//		System.out.println(domo);domo cannot be resolved to a variable
		
		//局部变量 在方法体，或者语句块内定义的变量
		char sex;//局部变量使用需要初始化
//		System.out.println(sex); The local variable sex may not have been initialized
		
	}
	
	
	
}


