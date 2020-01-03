package src.main.java.com.atguigu.day25Thread.CallableAndDeadLock;

/**
 * 单例设计模式 ： 懒汉式
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 50; i++) {
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Computer.getInstance());
				}
			}).start();
		}
		
	}
}

/**
 * 线程安全的懒汉式
 * @author Administrator
 *
 */
class Computer{
	
	private Computer(){}
	
	private static Computer computer = null;
	
	public static Computer getInstance(){
		
		if(computer == null){
			synchronized (Computer.class) {
				if(computer == null){
					computer = new Computer();
				}
			}
		}
		
		
		return computer;
		
	}
	
}
