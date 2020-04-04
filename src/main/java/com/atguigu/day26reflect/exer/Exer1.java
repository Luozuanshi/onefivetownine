package com.atguigu.day26reflect.exer;

/*
          
	
	
	
	
	
	三 编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，打印后将该整数放到集合中；
	共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出
	
	
	四 有2个账户分别向同一个卡上取钱（10000），每次都取1000
	
	
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
public class Exer1 {

	// 一 在main方法中创建并启动一个线程，该线程随机产生100个0-100随机整数，打印后结束；
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					
					System.out.println(Math.round(Math.random() * 100));
					
				}
				
			}
		}).start();
	}
}


















