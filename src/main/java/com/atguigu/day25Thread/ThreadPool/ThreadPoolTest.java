package src.main.java.com.atguigu.day25Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	//类是单例的
	private ThreadPoolTest(){}
	
	
	private static ThreadPoolTest tpt = new ThreadPoolTest();
	
	//属性 - 当前类只有一个对象，即然只有一个对象那么该属性只有一份
	private ExecutorService service = Executors.newCachedThreadPool();

	
	public static ThreadPoolTest getInstatnce(){
		return tpt;
	} 
	
	/**
	 * 二次封装 - 更灵活
	 * 
	 * 如果需要更换方法的底层的实现，那么只需要修改当前方法中的实现即可，其它调用此方法的类都不需要修改
	 */
	public void execute(Runnable r){
		service.execute(r);
	}
	
	
}
