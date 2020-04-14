/**
 * 
 */
package com.atguigu.day23;

/**
 * 	匿名对象的方式创建多线程
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月31日下午2:43:34 类描述
 */
public class ThreadTest1 {
	public static void main(String[] args) {
	
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
		}).start();
		
		
		
	}

}
