package src.main.java.com.atguigu.day24Thread.ThreadSafety;

/**
 * 
 * 解决线程安全问题的方法 ：
 * 
 * 第一种 ： 同步代码块
 * 
 * 格式 ： synchronized(同步监视器、锁){ 操作共享数据的代码 } 说明： 1.同步监视器可以是任意类的对象。
 * 
 * 第二种 ： 同步方法
 */
public class TicketTest2 {

	public static void main(String[] args) {
		new MyThread("窗口1").start();
		new MyThread("窗口2").start();
		new MyThread("窗口3").start();
	}
}

class MyThread extends Thread {
	
	public MyThread(String name){
		super(name);
	}
	//共享数据需要使用static修饰
	private static int ticket = 100;// 共享数据
	//创建一个同步监视器，锁
	private static Object lock = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (MyThread.class) {//注意 ： 锁不能使用this
				if (ticket >= 1) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "====" + ticket);
					ticket--;
				} else {
					return;
				}
			}
			
		}

	}

}