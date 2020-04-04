package com.atguigu.day26reflect.exer;

import java.util.Scanner;

//二 在main方法中创建并启动两个线程。第一个线程循环随机打印100以内的整数，直到第二个线程从键盘读取了“Q”命令。
public class Exer2 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (; ;) {
					try {
						//当调用线程的interrupt方法时，如果线程中正在执行sleep那么就会抛出异常，同时清除标记（interrupt方法不起作用）。
						Thread.sleep(3000);
					} catch (InterruptedException e) {
//						e.printStackTrace();
						return;
					}
					
//					if(Thread.currentThread().isInterrupted()){
//						return;
//					}
					System.out.println(Math.round(Math.random() * 100));
				}

			}
		});
		t.start();
		
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if("q".equals(str)){
			t.interrupt();
		}

	}
}
