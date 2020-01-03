package src.main.java.com.atguigu.day25Thread.CallableAndDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的第三种方式 ：
 * 说明：
 * 	  	1.自定义类并实现Callable接口
 * 		2.重写call方法
 * 		3.在call方法中实现需要在分线程中实现的功能
 * 		4.创建Callable实现类的对象
 * 		5.创建FutureTask对象并将Callable实现类的对象作为实参传到FutureTask的构造器中
 * 		6.创建Thread的对象并将FutureTask对象作为实参传到Thread的构造器中
 * 		7.调用start方法
 *
 */
public class CallableTest {

	public static void main(String[] args) throws Exception, Exception {
		
		//4.创建Callable实现类的对象
		MyCallable mc = new MyCallable();
		//5.创建FutureTask对象并将Callable实现类的对象作为实参传到FutureTask的构造器中
		FutureTask<String> ft = new FutureTask<>(mc);
		//6.创建Thread的对象并将FutureTask对象作为实参传到Thread的构造器中
		Thread thread = new Thread(ft);
		//7.调用start方法
		thread.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaa====" + i);
		}
		
		
		//获取分线程的返回值
		String str = ft.get(); //调用get()方法后，当前线程阻塞，等待分线程执行结束，然后继续向下执行。
		System.out.println(str);
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}

//1.自定义类并实现Callable接口
class MyCallable implements Callable<String>{

	//2.重写call方法
	@Override
	public String call() throws Exception {
		//3.在call方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
		return "ccc";
	}
	
}
