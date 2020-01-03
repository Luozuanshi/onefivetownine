package src.main.java.com.atguigu.day25Thread.CallableAndDeadLock;

import java.util.Arrays;

/**
 * 增强for循环遍历集合中，在遍历的过程，集合不能添加或者删除元素否则会抛异常。
 * 
 * （增强for循环底层用的是Iterator迭代器。在使用Iterator迭代器的遍历元素的过程中，该集合中数据不能改变。）
 */
public class CallableTest2 {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		/**
		 * 可以通过使用Callable接口的方式，获取添加数据后的numbers的数组
		 * 也可以通过调用t1的join方法，等线程操作结束再获取数据。
		 */
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					numbers[i] = i;
				}
				System.out.println("ccc" + Arrays.toString(numbers));
				
			}
		});
		t1.start();
		
		/**
		 * 增强for循环遍历集合中，在遍历的过程，集合不能添加或者删除元素否则会抛异常。 
		 */
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println(Arrays.toString(numbers));
		

		
	}
}
