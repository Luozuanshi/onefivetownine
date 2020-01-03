package src.main.java.com.atguigu.day25Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 Executors.newCachedThreadPool()：创建一个可根据需要创建新线程的线程池
 * Executors.newFixedThreadPool(n); 创建一个可重用固定线程数的线程池
 * Executors.newSingleThreadExecutor() ：创建一个只有一个线程的线程池
 * Executors.newScheduledThreadPool(n)：创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。
 * 
 */
public class ThreadPool {

	public static void main(String[] args) {
//		 创建一个线程池
		 ExecutorService service = Executors.newCachedThreadPool();

		 service.execute(new Runnable() {

		 @Override
		 public void run() {
		 for (int i = 0; i < 100; i++) {
		 System.out.println(Thread.currentThread().getName() + "****" + i);
		 }
		 }
		 });

		 service.execute(new Runnable() {

		 @Override
		 public void run() {
		 for (int i = 0; i < 100; i++) {
		 System.out.println(Thread.currentThread().getName() + "****" + i);
		 }
		 }
		 });

		ThreadPoolTest.getInstatnce().execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "===" + i);
				}
			}
		});

		ThreadPoolTest.getInstatnce().execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "===" + i);
				}
			}
		});

		 service.shutdown();
	}
}
