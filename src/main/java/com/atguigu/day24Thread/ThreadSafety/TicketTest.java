package src.main.java.com.atguigu.day24Thread.ThreadSafety;

/**
 * 
 * 解决
 * 第一种 ： 同步代码块线程安全问题的方法 ：
 *  *
 * 
 * 		格式 ： synchronized(同步监视器、锁){ 操作共享数据的代码 } 
 * 		说明： 1.同步监视器可以是任意类的对象,所有线程的锁必须是同一把。
 * 			 2.实现Runnable的方式锁可以是this,继承Thread的方式锁不能是this.
 * 
 * 第二种 ： 同步方法
 */
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

	private Object lock = new Object(); // 任意类的对象

	@Override
	public void run() {
			while (true) {
				synchronized (MyRunnable.class) {// 同步代码块
				if (ticket >= 1) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "====" + ticket);
					ticket--;

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					return;
				}
			}

		}

	}

}