package src.main.java.com.atguigu.day24Thread.ThreadAPI;

/*
static  void  yield()：线程让步
		暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
		若队列中没有同优先级的线程，忽略此方法
join() ：当某个程序执行流中调用其他线程的 join() 方法时，
		调用线程将被阻塞，直到 join() 方法加入的 join 线程执行完为止   例如: main线程中调用t线程
		低优先级的线程也可以获得执行 
static  void  sleep(long millis)：(指定时间:毫秒)
		令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
		抛出InterruptedException异常
yield() :  //释放当前CPU执行权，线程处于就绪状态等待下一次切换(分配CPU资源)

 */
public class ThreadAPI3 {

	public static void main(String[] args) {
	
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "=====" + i);
				}
			}
		},"线程1");
		
		t.start();
		
		for (int i = 0; i < 100; i++) {
//			if(i % 10 == 0){
//				Thread.currentThread().yield();
//			}
			
			if(i == 10){
//				try {
//					t.join();//main线程处于阻塞状态，让t线程执行，当t线程执行完毕再执行main线程
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
				try {
					//让当前线程睡觉，时间到了以后，继续执行（时间到了以后处于就绪状态等待CPU资源）。
					Thread.currentThread().sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				t.stop();
			}
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		
	}
}
