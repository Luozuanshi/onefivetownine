package src.main.java.com.atguigu.day24Thread.ThreadCycle;

/**
	线程的生命周期
 */
public class ThreadLifeCycle {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		},"线程1111111");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		},"线程22222222");
		
		t.start();
		t2.start();
		
	}
}
