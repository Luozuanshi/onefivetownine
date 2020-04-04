package com.atguigu.day25Thread.Work;

import java.util.ArrayList;

public class ConsumerProductor {
    public static void main(String[] args){
        Warehouse house = new Warehouse();//里面有一个ArrayList线程非安全
        Productor p = new Productor(house);
        //设置线程的优先级别1-10

        Consumer c1 = new Consumer(house,"张三");
        Consumer c2 = new Consumer(house,"李四");
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

class Warehouse{
//单例设计模式

    //仓库里面的集合  存放元素
    private ArrayList<String> list = new ArrayList<>();
    //向集合内添加元素的方法
    public synchronized void add(){
        if(list.size()<20) {
            list.add("a");
        }else{
            //return;//让方法执行到这里就结束方法
            try {
                this.notifyAll();
                this.wait();//仓库调用wait 不是仓库对象等待  访问仓库的生产者线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //从集合内获取元素的方法
    public synchronized void get(){
        if(list.size()>0) {
            list.remove(0);//集合越界的问题
        }else{
            //return;
            try {
                this.notifyAll();
                this.wait();//仓库对象调用wait  不是仓库对象等待  访问仓库的消费者线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "list=" + list +
                '}';
    }
}

class Consumer implements Runnable{

    //为了保证生产者 和消费者使用同一个仓库对象  添加一个属性
    private Warehouse house;
    private String name;
    public Consumer(Warehouse house,String name){
        this.house=house;
        this.name =name;
    }

    //消费者的方法  一直从仓库内获取元素
    public void run(){
        while(true){
            house.get();
            System.out.println("消费者"+name+"拿走了一件货物"+house.toString());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Productor implements Runnable{
    //为了保证生产者 和消费者使用同一个仓库对象  添加一个属性
    private Warehouse house;
    public Productor(Warehouse house){
        this.house=house;
    }

    //生产者的run方法  一直向仓库内添加元素
    public void run(){
        while(true){
            house.add();
            System.out.println("生产者存入了一件货物"+house.toString());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}