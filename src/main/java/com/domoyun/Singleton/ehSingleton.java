package com.domoyun.Singleton;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * 项目名称：interViewQueTopic 类名称：Singleton
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月9日 15:44:04
 * 	类描述 ： 手写一个单列设计模式
 *  常见的几种创建形式
 *  饿汉式：直接创建对象不存在线程安全问题
 *
 *  懒汉式：延迟创建对象
 *      线程不安全的（适用于单线程）
 *      线程安全（适用于多线程）
 *      静态内部类形式创建（适用于多线程）
 */
public class ehSingleton {

    //饿汉式-静态常量的方式创建单例
    @Test
    public void test1(){
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

    //枚举的饿汉式方式创建
    @Test
    public void test2(){
        Singleton3 instances = Singleton3.INSTANCES;
        Singleton3 instances1 = Singleton3.INSTANCES;
        System.out.println(instances.hashCode());
        System.out.println(instances1.hashCode());

    }

}
//饿汉式-静态常量的方式创建单例
class Singleton2{
    public static final Singleton2 INSTANCES = new Singleton2();
    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return INSTANCES;
    }

}

//枚举类型 饿汉式创建
enum Singleton3{
    INSTANCES
}

//饿汉式  - 静态代码块的方式创建，这种方式适合需要初始化一堆数据的时候使用
class Singleton4 {
    public static final Singleton4 INSTANCE;
    private String info;

    static{
        try {
            Properties pro = new Properties();

            pro.load(Singleton4.class.getClassLoader().getResourceAsStream("single.properties"));

            INSTANCE = new Singleton4(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton4(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3 [info=" + info + "]";
    }

}