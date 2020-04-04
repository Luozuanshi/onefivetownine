package com.atguigu.day26reflect.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//三 编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，打印后将该整数放到集合中；
//共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出
public class Exer3 {

	public static void main(String[] args) {
		
		List<Long> list = new ArrayList<>();
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					//让线程睡眠
					try {
						//new Random().nextInt(200) : 产生一个200以内的随机数
						Thread.sleep(new Random().nextInt(200));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					long number = Math.round(Math.random() * 100);
					System.out.println(number);
					list.add(number);
					
				}
				
			}
		});
		
		t.start();
		
		try {
			t.join(); //当前线程阻塞，当t线程执行完毕后再执行当前线程
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------我是main线程-------------------");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
}
