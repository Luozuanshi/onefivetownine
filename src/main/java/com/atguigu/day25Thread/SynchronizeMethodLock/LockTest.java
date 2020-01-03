package src.main.java.com.atguigu.day25Thread.SynchronizeMethodLock;

/**
 * 锁的再说明
 */
public class LockTest {

	public static void main(String[] args) {

//		Computer c = new Computer();
		
		/**
		 * 在调用同步方法、同步代码块 到底是交替执行还是执行完一个再执行另一个。
		 * 	看的是锁。
		 */
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				c.test();
//			}
//		}, "线程1------").start();
//
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				c.test2();
//			}
//		}, "线程2******").start();
//
		//----------------------------------------------------------------------------
		
		
		/**
		 * 在调用同步方法、同步代码块 到底是交替执行还是执行完一个再执行另一个。
		 * 	看的是锁。
		 */
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				new Computer().test();
//			}
//		}, "线程1------").start();
//
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				new Computer().test2();
//			}
//		}, "线程2******").start();
		
		//-------------------------------------------------------------------
		/**
		 * 在调用同步方法、同步代码块 到底是交替执行还是执行完一个再执行另一个。
		 * 	看的是锁。static修饰的同步方法 锁是该类的class字节码    不用static修饰的同步方法 默认锁是this
		 */
//		Computer c = new Computer();
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				new Computer().staticTest();
//			}
//		}, "线程1------").start();
//
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				new Computer().staticTest2();
//			}
//		}, "线程2******").start();

		//-------------------------------------------------------------------

		Computer c = new Computer();
		new Thread(new Runnable() {

			@Override
			public void run() {
				c.t();
			}
		}, "线程1------").start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				c.t2();
			}
		}, "线程2******").start();

	}
}

class Computer {
	/**
	 * 锁 ： Computer.class
	 */
	public static synchronized void staticTest() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * 锁  ： Computer.class
	 */
	public static synchronized void staticTest2() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * 锁 ： this
	 */
	public synchronized void test() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * 锁 ：this
	 */
	public synchronized void test2() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void t() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void t2() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	

}
