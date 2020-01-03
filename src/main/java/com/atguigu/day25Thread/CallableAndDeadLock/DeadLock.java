package src.main.java.com.atguigu.day25Thread.CallableAndDeadLock;

/**
 * 死锁 ：
 * 
 * 说明 ：不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁
 * 
 * 可以使用 jsconsole工具检测死锁:
 *
 */
public class DeadLock {
	static StringBuffer s1 = new StringBuffer();
	static StringBuffer s2 = new StringBuffer();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				
				
				synchronized (s1) {
					s2.append("A");
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (s2) {
						s2.append("B");
						System.out.print(s1);
						System.out.print(s2);
					}
				}
				
				
				
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				
				
				synchronized (s2) {
					s2.append("C");
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					synchronized (s1) {
						s1.append("D");
						System.out.print(s2);
						System.out.print(s1);
					}
				}
				
				
				
			}
		}.start();
		
		
	}
}
