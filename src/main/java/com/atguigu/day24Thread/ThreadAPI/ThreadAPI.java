package src.main.java.com.atguigu.day24Thread.ThreadAPI;

/*
 *  void start():  启动线程，并执行对象的run()方法
	run():  线程在被调度时执行的操作
	String getName():  返回线程的名称
	void setName(String name):设置该线程名称
	static currentThread(): 返回当前线程

 */
public class ThreadAPI {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		//设置线程的名字
		t.setName("线程1");
		t.start();
		System.out.println("线程的名字===" + t.getName());
	}
}
