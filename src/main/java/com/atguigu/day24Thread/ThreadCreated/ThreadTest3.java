package src.main.java.com.atguigu.day24Thread.ThreadCreated;

/**
 * 创建多线程的第二种方式 ： 实现Runnable接口
 * 
 *  1.自定义类并实现Runnable接口
 *  2.重写run方法
 *  3.在run方法去实现需要在分线程中实现的功能
 *  4.创建Runnable接口实现类的对象
 *  5.创建Thread类的对象并将Runnable接口实现类的对象作为实参传到Thread的构造器中
 *  6.调用start方法
 */
class MyRunnable2 implements Runnable {

	// 2.重写run方法
	@Override
	public void run() {
		// 3.在run方法去实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
	}

}

// 1.自定义类并实现Runnable接口
class MyRunnable implements Runnable {

	// 2.重写run方法
	@Override
	public void run() {
		// 3.在run方法去实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
	}

}

public class ThreadTest3 {

	public static void main(String[] args) {
		// 4.创建Runnable接口实现类的对象
		MyRunnable mr = new MyRunnable();
		// 5.创建Thread类的对象并将Runnable接口实现类的对象作为实参传到Thread的构造器中
		Thread t = new Thread(mr,"111111111");
		// 6.调用start方法
		t.start();

		// 思考 ：如何开启多个线程？
		// 1.再自定义一个类并实现Runnable接口再进行操作即可
		// 2.使用同一个类开启多个线程，需要再创建一个Thread类的对象，接收一个实现runnable实现类的对象作为构造器形参传入
		// 4.创建Runnable接口实现类的对象
		Thread t2 = new Thread(mr,"222222222");
		t2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
	}
}
