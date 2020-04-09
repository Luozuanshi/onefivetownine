package com.domoyun.Singleton;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 项目名称：interViewQueTopic 类名称：Singleton
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月9日 16:36:25
 * 	类描述 ： 手写一个单列设计模式
 *  常见的几种创建形式
 *  饿汉式：直接创建对象不存在线程安全问题
 *
 *  懒汉式：延迟创建对象
 *      线程不安全的（适用于单线程）
 *      线程安全（适用于多线程）
 *      静态内部类形式创建（适用于多线程）
 */
public class lhSingleton {
    //懒汉式 线程安全
    @Test
    public void test1() throws ExecutionException, InterruptedException {
        /*		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();

		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);*/

        Callable<Singleton5> c = new Callable<Singleton5>() {

            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);

        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        es.shutdown();

    }

}
//懒汉式线程安全
 class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        if(instance == null){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton5();
        }
        return instance;
    }
}

//懒汉式   延迟创建实例对象 线程安全

class Singleton6 {
    private static Singleton6 instance;
    private Singleton6(){

    }
    public static Singleton6 getInstance(){
        if(instance == null){//优化效率，如果创建过了不必每次都等待锁
            synchronized (Singleton6.class) {
                if(instance == null){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}

//懒汉式 - 线程安全    静态内部内的方式
/*
 * 在内部类被加载和初始化时，才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化的。
 * 因为是在内部类加载和初始化时，创建的，因此是线程安全的
 */
class Singleton7 {
    private Singleton7(){

    }
    private static class Inner{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return Inner.INSTANCE;
    }
}


