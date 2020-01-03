package src.main.java.com.atguigu.day24Thread.ThreadAPI;

/*
 线程的优先级控制
MAX_PRIORITY（10）;    
MIN _PRIORITY （1）;  
NORM_PRIORITY （5）;
涉及的方法：
getPriority() ：返回线程优先值 
setPriority(int newPriority) ：改变线程的优先级
线程创建时继承父线程的优先级

 */
public class ThreadAPI2 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "=====" + i);
				}
			}
		},"线程1");

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "*****" + i);
				}
			}
		},"线程2");
		
		t.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		t2.start();
	}
}
