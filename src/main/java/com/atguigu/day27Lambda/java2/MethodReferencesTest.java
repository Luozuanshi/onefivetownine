package com.atguigu.day27Lambda.java2;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 	1.当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
	2.方法引用可以看做是Lambda表达式深层次的表达。换句话说，方法引用就是Lambda表达式，也就是函数式接口的一个实例，
		通过方法的名字来指向一个方法，可以认为是Lambda表达式的一个语法糖。
	3.要求：实现接口的抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致！
		格式：使用操作符 “::” 将类(或对象) 与 方法名分隔开来。
	4.如下三种主要使用情况：
		对象::实例方法名
		类::静态方法名
		类::实例方法名

 */
public class MethodReferencesTest {
	
	/*
	 * 类::实例方法名 (特殊)
	 */
	@Test
	public void test3(){
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				/*
				 * 类 :: 实例方法名
				 * 类 ： 第一个形参的类型
				 * 第一个形参做为调用者，第二个形参做为实参。
				 */
				return o1.compareTo(o2);
			}
		};
		
		//--------------------lambda------------
		
		comparator = (o1,o2) -> o1.compareTo(o2);
		
		//-------------------方法的引用--------------
		
		comparator = String :: compareTo;
	}
	
	/*
	 	类::静态方法名
	 */
	@Test
	public void test2(){
	
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				/*
				 *  public static int compare(int x, int y) {
				    }
				 */
				return Integer.compare(o1, o2);
			}
		};
		
		//--------------------lambda-------------
		
		comparator = (o1,o2) -> Integer.compare(o1, o2);
		
		//-------------------方法的引用--------------
		
		comparator = Integer :: compare;
		
	}

	/*
	 * 对象::实例方法名
	 */
	@Test
	public void test(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				//方法体 ： 调用一个println方法
				System.out.println(t);
				/*
				  public void println(String x) {
				  }
				 */
			}
		};
		
		System.out.println("------------lambda------");
		
		Consumer<String> consumer2 = t -> System.out.println(t);
		
		System.out.println("------------方法引用------");
		
		PrintStream ps = System.out;
		Consumer<String> consumer3 = System.out ::println;
		consumer3.accept("hello");
	}
}













