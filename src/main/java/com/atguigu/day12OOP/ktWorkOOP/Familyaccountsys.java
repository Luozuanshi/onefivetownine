/**
 * 
 */
package com.atguigu.day12OOP.ktWorkOOP;

import java.util.Scanner;

/**
   * 项目名称：domo
   *类名称：Familyaccountsys
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月14日下午7:43:46
   * 类描述 家庭收支小软件OOP实现方式
 * 		// 分析
		// 1. 先完成显示菜单，如果用户输入4, 就退出系统
		// 2. 登记一笔收入
		// 分析：可以把收入放入到mysql 数据库，或者集合，或者数组， 也可以简单的使用字符串拼接
		// 使用一个变量，balance 保存当前的余额
		
		// 3. 登记一笔支出
		//  完成思路和登记收入类似
		
		// 4. 用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ，否 则循环输入指令，直到输入y 或者 n。
		//  分析：
 */
public class Familyaccountsys {
	public static void main(String[] args) {
		FamilyAccount familyaccount = new FamilyAccount();
		familyaccount.startshowMenu();
	}
}
