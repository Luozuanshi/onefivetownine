/**
 * 
 */
package com.domoyun.designmode.singleton;

/**
 * 项目名称：domo 类名称：SingletonType1
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月17日下午6:11:40 
 * 	类描述 ： 单例设计模式 -（静态代码块）饿汉式 
 * 		把类的实例放在了静态代码块中实现，随类的加载时创建
 * 		不推荐该方式，如果instance是public instance可以被重新修改
 */
public class SingletonTypeStatic {
	public static void main(String[] args) {
		
		//测试代码
		
		Singleton instance = Singleton.getInstance();
		Singleton.instance=null;
		Singleton instance1 = Singleton.getInstance();
		
		instance.name = "222232";
//		instance1.name = "33233";
		
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
	}
}

class Singleton {
	String name ;
	// 属性私有化，避免外部new创建对象实例
	private Singleton() {

	}
	//只创建一个对象实例
	public static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	//提供一个共有的静态方法，供外部访问该实例对象
	public static Singleton getInstance() {
		return instance;
	}

}