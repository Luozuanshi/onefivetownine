package src.main.java.com.atguigu.WorkExer;

/**
 * 18、用实现Runnable接口的方式，启动一个线程完成在线程中打印1-100的数字
 */
public class ThreadExer {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" " +i);
        }

    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }


}
