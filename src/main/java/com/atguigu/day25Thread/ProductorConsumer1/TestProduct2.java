package src.main.java.com.atguigu.day25Thread.ProductorConsumer1;

class Clerk { // 售货员
	private int product = 0;

	/**
	 * this
	 */
	public synchronized void addProduct() {
		if (product >= 20) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			product++;
			System.out.println("生产者生产了第" + product + "个产品");
			notifyAll();
		}
	}

	/**
	 * this
	 */
	public synchronized void getProduct() {
		if (this.product <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("消费者取走了第" + product + "个产品");
			product--;
			notifyAll();
		}
	}
}

public class TestProduct2 {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();

		new Thread(new Runnable() { //生产者
			@Override
			public void run() {
				System.out.println("生产者开始生产产品");
				while (true) {
					clerk.addProduct();
				}
			}
		}).start();

		new Thread(new Runnable() { //消费者
			@Override
			public void run() {
				System.out.println("消费者开始取走产品");
				while (true) {
					clerk.getProduct();
				}
			}
		}).start();
	}
}


