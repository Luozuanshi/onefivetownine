package src.main.java.com.atguigu.day25Thread.ProductorConsumer;

/**
 * 线程通信：
 * 
 * wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，而当前线程排队等候再次对资源的访问
 * notify()：唤醒正在排队等待同步资源的线程中优先级最高者结束等待 notifyAll ()：唤醒正在排队等待资源的所有线程结束等待
 * 
 * 
 * [面试题]sleep和wait的区别是什么？ 1.在调用sleep时线程不会释放锁。在调用wait方法时线程会释放锁。
 * 2.sleep方法是Thread类中。wait方法是Object类中的。
 * 3.调用wait()方法需要被notify/notifyAll唤醒。调用sleep(long millis)时间到后会自动唤醒。
 * 
 * 注意 ： 1.调用的是同步监视器的wait()/notify()/notifyAll();
 * 2.wait()/notify()/notifyAll()只能在同步代码块和同步方法中使用。
 */
public class TicketTest {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr, "窗口1").start();
		new Thread(mr, "窗口2").start();
	}
}

class MyRunnable implements Runnable {

	private int number = 100;// 共享数据

	private Object obj = new Object();

	/**
	 * 需求 ： 两个线程依次输出 100 ~ 1 第一个线程 ： 100 第二个线程 ： 99 第一个线程 ： 98 ......
	 */
	@Override
	public void run() {
		while (true) {
			synchronized (obj) {// 同步代码块
				obj.notify();// notify唤醒一个线程，notifyAll唤醒所有线程。

				if (number >= 1) {

					System.out.println(Thread.currentThread().getName() + "====" + number);
					number--;

				} else {
					return;
				}

				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
