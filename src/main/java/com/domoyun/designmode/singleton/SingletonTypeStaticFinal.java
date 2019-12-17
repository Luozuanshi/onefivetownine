/**
 * 
 */
package com.domoyun.designmode.singleton;

/**
 * 项目名称：domo 类名称：SingletonType1
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月17日下午6:11:40 
 * 	类描述 ： 单例设计模式 -（静态常量）饿汉式 
 * 		推荐使用这种懒汉式     只有调用该类的getInstance方法，类加载,才初始化instance
 * 		即使instance设置成public 的外部类也不能直接赋值修改
 */
public class SingletonTypeStaticFinal {
	public static void main(String[] args) {
		
		//测试代码
		Singleton2 instance = Singleton2.getInstance();
		Singleton2 instance1 = Singleton2.getInstance();
		
		instance.name = "222232";
		instance1.name = "33233";
		
		System.out.println(instance.name);
		System.out.println(instance.hashCode());
		System.out.println(instance.hashCode());
	}
}

class Singleton2 {
	String name ;
	// 属性私有化，避免外部new创建对象实例
	private Singleton2() {

	}
	//只创建一个对象实例
	public final static Singleton2 instance = new Singleton2();
	
	//提供一个共有的静态方法，供外部访问该实例对象
	public static Singleton2 getInstance() {
		return instance;
	}

}