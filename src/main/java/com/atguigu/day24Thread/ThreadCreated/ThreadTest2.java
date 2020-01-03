package src.main.java.com.atguigu.day24Thread.ThreadCreated;

/**
	创建线程的方式有两种：
	
	第一种 ： 继承Thread
		1.自定一个类并继承Thread
		2.重写run方法
		3.在run方法实现需要在分线程中实现的功能
		4.创建Thread的子类的对象
		5.调用start方法
	
	第二种 ： 实现Runnable接口（详见ThreadTest3.java）
	
	说明：
		1.可以通过Thread的构造器给线程起名字
 */
class MyThread2 extends Thread{
	//2.重写run方法
	@Override
	public void run() {
		//3.在run方法实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			/*
			 * Thread.currentThread():获取当前线程
			 * getName() : 获取线程的名字
			 */
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}


//1.自定一个类并继承Thread
class MyThread extends Thread{
	//思考 ：调用Thread的构造器-给线程起名字
	public MyThread(String name){
		super(name);//调用父类的有参构造器
	}
	//2.重写run方法
	@Override
	public void run() {
		//3.在run方法实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			/*
			 * Thread.currentThread():获取当前线程
			 * getName() : 获取线程的名字
			 */
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}


public class ThreadTest2 {

	/*
	 * 注意 ： 本章内容全部不允许在测试方法中去运行。
	 */
	public static void main(String[] args) {
		//4.创建Thread的子类的对象
		MyThread mt = new MyThread("线程一");
		//5.调用start方法
		mt.start();//作用 ：1.开启分线程   2.调用run方法
//		mt.run();这样写不对这样没有开启分线程
		
		//思考 ：如何再开启一个线程
		//1.再创建一个类继承Thread并创建子类对象调用start方法
		//2.使用同一个类开启两个线程
//		mt.start();不对 需要再创建一个该类的对象调用start方法
		MyThread mt2 = new MyThread("线程二");
		mt2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "*******" + i);
		}
	}
}









