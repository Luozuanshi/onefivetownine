package src.main.java.com.atguigu.day24Thread.ThreadAPI;

/**
 *  stop(): 强制线程生命期结束（不建议使用-过时了）
	boolean isAlive()：返回boolean，判断线程是否还活着
 *
 *  interrupt() : 通知某个线程结束（打一个标记）
 *  isInterrupted() ： 判断当前线程是否结束
 *  
 */
public class ThreadAPI4 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(
							Thread.currentThread().getName() 
							+ "=====" 
							+ i);
					if(Thread.currentThread().isInterrupted()){//当前线程必须结束
						//保存数据
						System.out.println("数据保存完毕-------");
						return;//run方法执行完毕线程死亡。
					}
				}
			}
		},"线程1111111");
		t.start();
		
		
		for (int i = 0; i < 100; i++) {
			if(i == 10){
				t.interrupt();//杀死t线程
			}
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		
		System.out.println(t.isAlive());
	}
}
