/**
 * 
 */
package com.atguigu.day11OOP.route;

/**
 * 项目名称：domo 类名称：Text
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月13日下午7:04:10 类描述
 * 	1. 在java中，可以让一个父类的引用 （变量）， 指向它的一个子类的对象
	2. 当我们编写程序时，编译器识别的是编译类型， 当程序运行时， jvm运行识别的是运行类型
	3. new Dog() 子类，赋给 父类 Animal 这个就称为向上转型
	
	属性没有重写之说！属性的值看编译类型
	     建议父类定义过的属性子类不再定义。
	     如果子类定义了父类有的同名属性，并且实现了相应的有参数构造，创建子类的对象默认初始化了子类的对应属性
 */
public class Test {
	public static void main(String[] args) {
		Animal dog = new Dog("小黑");
		System.out.println(dog.getName());
		dog.setName("小白");
		System.out.println(dog.getName());
		dog.say();
	}
}
