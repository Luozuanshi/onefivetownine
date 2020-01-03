package src.main.java.com.atguigu.day25Thread.ThreadPool;

import java.util.concurrent.locks.ReentrantLock;

public class TicketTest {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr, "窗口1").start();
		new Thread(mr, "窗口2").start();
		new Thread(mr, "窗口3").start();
	}
}

class MyRunnable implements Runnable {

	private int ticket = 100;// 共享数据
	//使用ReentrantLock来替代synchronized
	private ReentrantLock lock = new ReentrantLock();
	
	@Override
	public void run() {
		while (true) {
			//上锁
			lock.lock();
			try{
				if (ticket >= 1) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "====" + ticket);
					ticket--;

					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				} else {
					return;
				}
			}finally{
				//无论如何都必须解锁
				lock.unlock();
			}
		}

	}

}










