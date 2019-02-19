package com.domo.DataTypeAndArithmeticOperator;

import java.util.Scanner;

/**
   * 项目名称：domo
   *类名称：ScannerObject
 * @author Administrator
 * @version 1.0
   * 创建时间2019年2月19日下午8:00:34
   * 类描述：scanner对象
 */
public class ScannerObject {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name =scanner.nextLine();
		
		System.out.println("请输入你的爱好");
		String favor =scanner.nextLine();
		
		System.out.println("请输入你的年龄");
		int age =scanner.nextInt();
		
		System.out.println(name+" "+favor+" "+age);	
		System.out.println("来到地球的天数"+age*365);	
		System.out.println("离开地球的天数"+(72-age)*365);	
	}
}
