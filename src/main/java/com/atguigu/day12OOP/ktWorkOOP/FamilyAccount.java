/**
 * 
 */
package com.atguigu.day12OOP.ktWorkOOP;

import java.util.Scanner;

/**
 * 项目名称：domo 类名称：FamilyAccount
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月14日下午8:26:40 类描述
 */
public class FamilyAccount {
	private double balance = 10000; // 余额
	private double money; // 支出或者收入的金额
	private String note; // 交易说明
	private Scanner in = new Scanner(System.in); // 接收用户的输入
	private char key; // 匹配用户的菜单选项
	private boolean loop = true; // 是否继续执行
	private char choice; // 用户退出时候的确认选择
	private String details = "-----------------当前收支明细记录-----------------\n收支\t账户金额\t\t收支金额\t\t说     明";// 输出收支明细流水

	public void startshowMenu() {
		do {

			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println("                 1 收支明细");
			System.out.println("                 2 登记收入");
			System.out.println("                 3 登记支出");
			System.out.println("                 4 退      出");
			System.out.print("请选择(1-4): ");

			key = in.next().charAt(0); // 接收用户输入

			switch (key) {
			case '1':
				showMenu();
				break;
			case '2':
				income();
				break;
			case '3':
				pay();
				break;
			case '4':
				exit();
				break;
			default:
				System.out.println("输入的菜单选项错误...请重新输入");
				break;

			}

		} while (loop);

		System.out.println("你退出了家庭记账小软件~~");
	}

	public void showMenu() {
		System.out.println(details); // 输出收支明细流水
		System.out.println();
	}

	public void income() {
		System.out.print("本次收入的金额：");
		money = in.nextDouble(); // 获取收支的明细
		if (money > 0) { // 判断收支的金额
			balance += money; // 增加余额并且要求接收用户输入的说明
			System.out.print("本次收入说明：");
			note = in.next();
			// 将本次收入情况，拼接到 details
			details += "\n收入\t" + balance + "\t\t" + money + "\t\t" + note; // 累加变量流水details
		} else {
			System.out.println("金额有误");
		}
		System.out.println();
	}

	public void pay() {
		System.out.println("本次支付的金额：");
		money = in.nextDouble(); // 获取支出的明细
		if (money > 0 && money <= balance) { // 判断收支的金额
			balance -= money; // 扣减余额并且要求接收用户输入支出的说明
			System.out.print("本次指出说明：");
			note = in.next();
			// 将本次收入情况，拼接到 details
			details += "\n支出\t" + balance + "\t\t" + money + "\t\t" + note;// 累加收支流水
		} else {
			System.out.println("金额有误");
		}
		System.out.println();
	}

	public void exit() {
		while (true) {
			System.out.println("你确定要退出吗? y/n"); // 提示确认是否要退出
			choice = in.next().toLowerCase().charAt(0); // 接收用户收入
			if (choice == 'y') { // 如果输入的是y loop变量置false 整个循环判断尾条件不成立退出整个循环。
				loop = false;
				break;
			} else if (choice == 'n') { // 如果输入的是n 跳出当前循环
				break;
			}
		}
	}
}
