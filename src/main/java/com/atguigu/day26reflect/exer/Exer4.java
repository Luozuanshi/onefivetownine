package com.atguigu.day26reflect.exer;

/*
 五  银行有一个账户Account包含属性name, balance
	写一个普通 类Deposit实现Runnable, 在run方法中存钱 
	有两个柜台(线程)分别同时向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。睡眠10毫秒
	问题：该程序是否有安全问题，如果有，如何解决？
	扩展练习 :
	一个柜台Deposit存3000元, 每次存1000,存3次
	另一个柜台Withdraw取3000元, 每次取1000,取3次
	【提示】
	1，明确哪些代码是多线程运行代码，须写入run()方法
	2，明确什么是共享数据。
	3，明确多线程运行代码中哪些语句是操作共享数据的。
 */

class Account{
	public String name;
	public double balance;
}

class Deposit implements Runnable{
	
	private Account account;
	
	public Deposit(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		
		/**
		 * 注意 ： 只要是多个线程同时操作共享数据都存在线程安全问题
		 */
		for (int i = 0; i < 3; i++) {
			
			synchronized (this) {
				account.balance = account.balance +  1000;
				
				System.out.println(account.balance);
				
				//睡10毫秒
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
public class Exer4 {

	public static void main(String[] args) {
		
		Deposit deposit = new Deposit(new Account());
		new Thread(deposit).start();
		new Thread(deposit).start();
		
	}
}
