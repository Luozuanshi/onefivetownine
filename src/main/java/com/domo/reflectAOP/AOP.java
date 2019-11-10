/**
 * 
 */
package com.domo.reflectAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
   * 项目名称：domo
   *类名称：AOP
 * @author Administrator
 * @version 1.0
   * 创建时间2019年8月11日下午4:48:12
   * 类描述
 */

interface Human{
	void info();
	void fly();
}

//被代理类
class SuperMan implements Human {
	public void info() {
		System.out.println("我是超人！我怕谁");
	}
	
	public void fly() {
		System.out.println("I believe I can fly");
	}
}

class HumanUtils {
	public void method1() {
		System.out.println("=========方法一========");
	}
	public void method2() {
		System.out.println("=========方法二========");
	}
}


class MyInvocationHandler implements InvocationHandler {
	Object obj;//被代理对象的申明
	
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		HumanUtils human = new HumanUtils();
		human.method1();
		Object returnValue = method.invoke(obj, args);
		human.method2();
		return returnValue;
	}
	
}

class MyProxy {
	//动态的创建一个代理类的对象
	public static Object getproxyInstance(Object obj) {
		MyInvocationHandler handler =new MyInvocationHandler();
		handler.setObject(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
		
	}
}


public class AOP {

	public static void main(String[] args) {
		SuperMan Man = new SuperMan();
		Human superMan =(Human) MyProxy.getproxyInstance(Man);
		superMan.fly();
		superMan.info();
		
	}
}
