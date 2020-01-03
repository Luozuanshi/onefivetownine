package src.main.java.com.atguigu.day24Thread.ThreadCycle;

/**
 	模拟三个窗口售票
 	
 	说明：
 		1.三个窗口卖票，出现了重票，0票的问题
 		
 	出现问题的原因 ： 当多个线程同时操作共享数据时。一个线程还没有操作完共享数据时，另一个线程就进来再操作共享数据。然后
 			就会发生线程安全问题
 			
 	解决线程安全问题的思路 ： 当一个线程在操作共享数据时，其它线程不允许操作该数据。
 */
public class TicketTest {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr,"窗口1").start();
		new Thread(mr,"窗口2").start();
		new Thread(mr,"窗口3").start();
	}
}


class MyRunnable implements Runnable{

	private int ticket = 100;//共享数据
	
	@Override
	public void run() {
		
		while(true){
			
			if(ticket > 0){
				//卖票
				System.out.println(Thread.currentThread().getName() + "====" + ticket);
				ticket--;
				
			}else{
				return;
			}
			
		}
		
	}
	
}