package src.main.java.com.atguigu.day24Thread.ThreadCreated;

/*
 * 
 * 一 程序 ：一段静态的代码
 * 	  进程：正在运行的程序就是一个进程
 *   线程：一个进程中可以开启多个线程，每个线程可以单独去完成一个任务。多个线程之间是同时执行的。
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {

		boolean isFlag = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (isFlag) {
					System.out.println("-----杀毒中 ------");
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (isFlag) {
					System.out.println("-----清理垃圾中 ------");
				}
			}
		}).start();

		

	}
}
