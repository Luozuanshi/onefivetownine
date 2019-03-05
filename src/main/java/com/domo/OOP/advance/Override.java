package com.domo.OOP.advance;

/**
   * 项目名称：domo
   *类名称：Override
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月5日下午11:22:30
   * 类描述:重写
   * 方法的重写需要符合下面的三个要点：

      1.“==”： 方法名、形参列表相同。

      2.“≤”：返回值类型和声明异常类型，子类小于等于父类。

      3.“≥”： 访问权限，子类大于等于父类。
 */
public class Override {
	public static void main(String[] args) {
		Vehicle horse =new  Horse();  //子类实例化 ,返回的对象还是具备子类的方法
		Vehicle plane =new  Plane();  //子类实例化 ,返回的对象还是具备子类的方法
		horse.run();
		horse.stop(); //子类继承父类就有了父类的方法
		System.out.println(horse.whoIsPsg());
		plane.run();
		plane.stop();
	}
}

class Vehicle { // 交通工具类
    public void run() {
        System.out.println("跑....");
    }
    public void stop() {
        System.out.println("停止不动");
    }
    public Person whoIsPsg() {
    	return new Person();
    }
}
class Horse extends Vehicle { // 马也是交通工具
    public void run() { // 重写父类方法
        System.out.println("四蹄翻飞，嘚嘚嘚...");
    }
    
    public student whoIsPsg() {//重写父类具有返回值的方法,返回值类型，子类小于等于父类。
    	return new student();
    }
}
 
class Plane extends Vehicle {//飞机也是交通工具
    public void run() { // 重写父类方法
        System.out.println("天上飞！");
    }
    public void stop() { // 重写父类方法
        System.out.println("空中不能停，坠毁了！");
    }
}