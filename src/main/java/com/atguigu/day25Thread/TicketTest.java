package src.main.java.com.atguigu.day25Thread;

/**
 * 线程通信      wait(); notify();  notiftAll();
 */
public class TicketTest {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        new Thread(th,"窗口一").start();
        new Thread(th,"窗口二").start();

    }
}

class MyThread  implements  Runnable{
    int number=1000;
    @Override
    public void run() {

        while (true){
            synchronized (this){
                notify();

                if (number >= 1){
                    System.out.println(Thread.currentThread().getName()+"===="+number);
                    number--;
                }else{
                    return;
                }

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}