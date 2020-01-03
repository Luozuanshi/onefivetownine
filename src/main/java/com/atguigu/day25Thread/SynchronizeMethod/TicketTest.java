package src.main.java.com.atguigu.day25Thread.SynchronizeMethod;

/**
 * 解决线程安全问题的方法 ： 同步方法
 * 
 * 一 格式：
 * 
 * 		权限修饰符 synchronized 返回值 方法名（形参列表）
 * 		{ 
 * 			操作共享数据的代码 
 * 		}
 * 
 * 二 说明： 
 * 		1.我们可以把操作共享数据的代码放到方法中，该方法为同步方法。
 * 		2.实现Runnable的方式可以直接使用同步方法。
 * 		    继承Thread的方式在使用同步方法时，必须使用static修饰
 * 
 * 
 * 
 * 三  [面试题]继承Thread和实现Runnable的方式谁更好？
 * 		实现Runnable的方式更好
 * 
 * 		1.单继承多实现 ： 
 * 		2.同步资源:
 * 			继承Thread： 同步资源需要使用static修饰
 * 			实现Runnable ： 同步资源不需要使用static修饰
 * 		3.同步代码块：
 * 			继承Thread：不能使用this
 * 			实现Runnable ：可以使用this
 * 		4.同步方法：
 * 			继承Thread：同步方法必须被static修饰
 * 			实现Runnable ：同步方法不用使用static修饰
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
			if(!sale()){
				return;
			}
		}

	}
	
	/**
	 * 同步方法 : 锁默认是this
	 */
	public synchronized boolean sale(){
		if (ticket >= 1) {
			// 卖票
			System.out.println(Thread.currentThread().getName() + "====" + ticket);
			ticket--;

			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return true;
		} else {
			return false;
		}
	}

}










