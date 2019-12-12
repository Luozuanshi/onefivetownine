/**
 * 
 */
package com.atguigu.day10OOP.Work6;

/**
   * 项目名称：domo
   *类名称：AccoutnTest
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日下午1:52:48
   * 类描述 八： 创建程序,在其中定义两个类：Account和AccountTest类体会Java的封装性。
	Account类要求具有属性：姓名(String长度2-4)、余额(至少10)、密码(六位)
	通过setXxx的方法给Account 的属性赋值。
	在AccountTest中测试 
 */
public class AccoutnTest {
	public static void main(String[] args) {
		Account account = new Account("张三","123456789",100.0,"pwd123");
		Account account2 = new Account("李四","1234567899",10.0,"pwd321");
		account.query("pwd123");
		account.recharge("pwd123", 1000);//充值
		account.query("pwd123");
		account.withdraw("pwd123", 500);//取现
		account.query("pwd123");
		account.transfer(account2,"1234567899", 500);//转账
		account.query("pwd123");
		
		
		account2.query("pwd321");
	}
}
