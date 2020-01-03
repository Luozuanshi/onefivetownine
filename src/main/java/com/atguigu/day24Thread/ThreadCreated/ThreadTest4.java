package src.main.java.com.atguigu.day24Thread.ThreadCreated;

/**
 * 通过创建匿名内部类的对象的方式开启分线程
 * @author Administrator
 *
 */
public class ThreadTest4 {

	public static void main(String[] args) {
		
		//1.继承Thread的方式
		new Thread(){//创建Thread匿名子类的匿名对象
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "--------" + i);
				}
			}
		}.start();
		//2.实现Runnable接口的方式
		new Thread(new Runnable(){//创建了Runnable接口的匿名实现类的匿名对象
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "--------" + i);
				}
			}
		}).start();
	}
}
