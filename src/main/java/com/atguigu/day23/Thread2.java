/**
 * 
 */
package com.atguigu.day23;

/**
   * 项目名称：domo
   *类名称：Thread2
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月31日下午4:54:04
   * 类描述
 */
public class Thread2 {
	public static void main(String[] args) {
		Thread1 t1 =new Thread1() ; 
		new Thread(t1,"窗口1").start();
		new Thread(t1,"窗口2").start();
		new Thread(t1,"窗口3").start();
		
	}
}

class Thread1 implements Runnable{
	private int  ticket = 100;

	@Override
	public void run() {

		while(true) {
			if(ticket >=1) {
				System.out.println(Thread.currentThread().getName()+" "+ticket);
				
				ticket--;
			}
		}
	}
	
	
	
}