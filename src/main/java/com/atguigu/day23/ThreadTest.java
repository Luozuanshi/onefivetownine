/**
 * 
 */
package com.atguigu.day23;

/**
   * 项目名称：domo
   *类名称：Thread
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月31日上午11:55:44
   * 类描述
 */
public class ThreadTest {

	
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		t1.start();
		thread2 t2 = new thread2();
		t2.start();

	}
}

class thread1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}

class thread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i % 2 != 0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}
