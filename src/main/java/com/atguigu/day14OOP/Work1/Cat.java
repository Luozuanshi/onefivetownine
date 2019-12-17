/**
 * 
 */
package com.atguigu.day14OOP.Work1;

/**
   * 项目名称：domo
   *类名称：Cat
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月17日下午7:43:53
   * 类描述	2：按要求实现下列问题：
1）动物类Animal包含了抽象方法  shout()；
2）Cat类继承了Animal，并实现方法shout，打印“猫会喵喵叫”
3）Dog类继承了Animal，并实现方法shout，打印“狗会汪汪叫”
4）在测试类中实例化对象Animal a1 =new  Cat(),并调用a1的shout方法
5）在测试类中实例化对象Animal a2 =new  Dog(),并调用a2的shout方法

声明Clothing接口 ，在接口中声明 calcArea方法、getColor方法和getDetails方法。
改写Shirt类实现Clothing接口，然后实现接口中的所有方法。
在TestShirt类的main  方法中：
试着创建 Clothing对象，确认是否允许？
使用本态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
使用Clothing多态引用创建Shirt对象，并调用calcArea方法，打印计算结果。 
 */
public class Cat extends Animal {

	@Override
	public void shout() {
		System.out.println("猫会喵喵叫");
	}

}
