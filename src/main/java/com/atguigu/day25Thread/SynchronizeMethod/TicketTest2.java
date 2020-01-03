package src.main.java.com.atguigu.day25Thread.SynchronizeMethod;

/**
 
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
			if(!sale()){
				return;
			}
		}

	}
	
	/**
	 * 同步方法 : 锁默认是this
	 * 
	 * 在继承Thread的方式中，同步方法必须使用static修饰。static修饰的同步方法的锁默认是 (当前类.class)
	 */
	public static synchronized boolean sale(){
		if (ticket >= 1) {
			// 卖票
			System.out.println(Thread.currentThread().getName() + "====" + ticket);
			ticket--;
			return true;
		} else {
			return false;
		}
	}

}